package com.jekss.controller;

/**
 * Created by jekss on 18.07.16.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.jekss.util.GetFileInPath;
import com.jekss.util.ParsingCsvInBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Handles requests for the application file upload requests
 */

@Controller
@PropertySource("classpath:app.properties")
public class FileUploadController {

    @Resource
    private Environment env;

    @Resource
    private ParsingCsvInBase parsingCsvInBase;

    @Resource
    private GetFileInPath getFileInPath;

    String fileName;

    private static final String PATH_IN_FILE = "path.in.file";


    /**
     * Upload single file using Spring Controller
     */

    @RequestMapping(value = "upload", method = RequestMethod.GET)
    String uploadPage(Model model, HttpServletRequest httpServletRequest) {

        parsingCsvInBase.setSavePath(httpServletRequest);
        model.addAttribute("lists", getFileInPath.getFileNameFromFolder(parsingCsvInBase.getSavePath()));

        return "upload";
    }

    @RequestMapping(value = "listfileindirectory", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getAllNameFileInDirectory() {

        List<String> nall = new ArrayList<>();
        if (getFileInPath.getFileNameFromFolder(parsingCsvInBase.getSavePath()).equals(nall)) {
            nall.add("folse");
            return nall;
        } else {
            return getFileInPath.getFileNameFromFolder(parsingCsvInBase.getSavePath());
        }
    }


    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String uploadFileHandler(@RequestParam("file") MultipartFile file,
                                    HttpServletRequest request, Model model) {

        //fileName = file.getOriginalFilename();
        if (parsingCsvInBase.getFileExtension(file).equals("csv")) {
            if (parsingCsvInBase.uploadFile(file, request)) {
                model.addAttribute("upload", file.getOriginalFilename() + " upload done");
            } else model.addAttribute("upload", file.getOriginalFilename() + " upload error");
        } else model.addAttribute("upload", file.getOriginalFilename() + " upload error extension filed");

        return "upload";
    }


    @RequestMapping(value = "uploadCsv")
    @ResponseBody
    public List<String> upgradeBase(@RequestParam(value = "name") String fileName, HttpServletRequest request) {
        //System.out.println(fileName.trim() + " filename in upgrade base");

        if(parsingCsvInBase.getCount() != 0){
            parsingCsvInBase.setCountAll(0);
            parsingCsvInBase.setCount(0);
        }

        parsingCsvInBase.setCountAll(fileName.trim(), request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE));

        //System.out.println(parsingCsvInBase.getCountAll() + " get count all in test");

        parsingCsvInBase.setCsvProdAll(fileName.trim(), request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE));

        List<String> res = new ArrayList<>();
        res.add("ok");
        return res;
    }

    //SSE
    @RequestMapping(value = "testSSE", method = RequestMethod.GET)
    public void SSE(HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println(parsingCsvInBase.getProcentUploadFileInBase() + "     %%%%%%%%%%%%%%%");

        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();

        if (parsingCsvInBase.getProcentUploadFileInBase() < 100) {
            writer.write("data: " + parsingCsvInBase.getProcentUploadFileInBase() + "\n\n");
            writer.flush();

        } else if (parsingCsvInBase.getProcentUploadFileInBase() == 100) {
            writer.write("data: " + parsingCsvInBase.getProcentUploadFileInBase() + "\n\n");
            writer.write("data: " + parsingCsvInBase.getProcentUploadFileInBase() + "\n\n");
            writer.write("data: " + parsingCsvInBase.getProcentUploadFileInBase() + "\n\n");
            writer.flush();
            writer.close();
        } else {
            writer.close();
        }


    }


    /**
     * Upload multiple file using Spring Controller
     */
//    @RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
//    public @ResponseBody
//    String uploadMultipleFileHandler(@RequestParam("name") String[] names,
//                                     @RequestParam("file") MultipartFile[] files) {
//
//        if (files.length != names.length)
//            return "Mandatory information missing";
//
//        String message = "";
//        for (int i = 0; i < files.length; i++) {
//            MultipartFile file = files[i];
//            String name = names[i];
//            try {
//                byte[] bytes = file.getBytes();
//
//                // Creating the directory to store file
//                String rootPath = System.getProperty("catalina.home");
//                File dir = new File(rootPath + File.separator + "tmpFiles");
//                if (!dir.exists())
//                    dir.mkdirs();
//
//                // Create the file on server
//                File serverFile = new File(dir.getAbsolutePath()
//                        + File.separator + name);
//                BufferedOutputStream stream = new BufferedOutputStream(
//                        new FileOutputStream(serverFile));
//                stream.write(bytes);
//                stream.close();
//
//                logger.info("Server File Location="
//                        + serverFile.getAbsolutePath());
//
//                message = message + "You successfully uploaded file=" + name
//                        + "";
//            } catch (Exception e) {
//                return "You failed to upload " + name + " => " + e.getMessage();
//            }
//        }
//        return message;
//    }

}
