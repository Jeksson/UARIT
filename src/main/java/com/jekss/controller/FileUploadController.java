package com.jekss.controller;

/**
 * Created by jekss on 18.07.16.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import com.jekss.util.GetFileInPath;
import com.jekss.util.ParsingCsvInBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
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
public class FileUploadController {

    @Resource
    ParsingCsvInBase parsingCsvInBase;

    @Autowired
    GetFileInPath getFileInPath;

    String fileName;

    private static final Logger logger = LoggerFactory
            .getLogger(FileUploadController.class);

    /**
     * Upload single file using Spring Controller
     */

    @RequestMapping(value = "upload", method = RequestMethod.GET)
    String uploadPage(Model model, HttpServletRequest httpServletRequest) {


        model.addAttribute("lists", getFileInPath.getFileNameFromFolder(parsingCsvInBase.getSavePath(httpServletRequest)));

        return "upload";
    }

    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public String uploadFileHandler(@RequestParam("file") MultipartFile file,
                                    HttpServletRequest request, Model model) {

        fileName = file.getOriginalFilename();
        if (parsingCsvInBase.getFileExtension(file).equals("csv")) {
            if (parsingCsvInBase.uploadFile(file, request)) {
                model.addAttribute("upload", file.getOriginalFilename() + " upload done");
            } else model.addAttribute("upload", file.getOriginalFilename() + " upload error");
        } else model.addAttribute("upload", file.getOriginalFilename() + " upload error extension filed");


        return "upload";
    }


    // ajax           запускает метод загрузки файла в базу
//    @RequestMapping(value = "uploadCsv", method = RequestMethod.GET)
//    @ResponseBody
//    public void addInBaseFile(HttpServletRequest httpServletRequest) throws IOException {
//
//        parsingCsvInBase.setCsv(fileName, httpServletRequest);
//
//    }


    //  ajax          запускает метод вычитания процента и отдает значение на view пользователя
//    @RequestMapping(value = "uploadprocent", method = RequestMethod.GET)
//    @ResponseBody
//    public Set<Integer> getProcentUploadInBase() throws IOException, InterruptedException {
//
//        Set<Integer> result = new HashSet<>();
//        result.add(parsingCsvInBase.getProcentUploadFileInBase());
//        return result;
//    }

    //ajax            запускает метод который подсчитывает общее колличество строк в файле
//    @RequestMapping(value = "uploadcountall", method = RequestMethod.GET)
//    @ResponseBody
//    public void getCountAll(HttpServletRequest httpServletRequest) throws IOException {
//
//        parsingCsvInBase.getCountAll(fileName, httpServletRequest);
//
//    }

    @RequestMapping(value = "uploadCsv")
    public void testUpgradeBase(HttpServletRequest request){

//        try {
//            parsingCsvInBase.setCountAll(fileName, request);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(parsingCsvInBase.getCountAll() + " count all ");


        System.out.println("-----------");
        //parsingCsvInBase.setCsv(parsingCsvInBase.getBufferedReader(fileName, request));

    }

    //SSE
    @RequestMapping(value = "testSSE", method = RequestMethod.GET)
    public void testSSE(HttpServletResponse response, final HttpServletRequest request)
            throws ServletException, IOException {



        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();

        for (int proc = 0 ; proc <= 100; proc = parsingCsvInBase.getProcentUploadFileInBase() ){


            System.out.println(parsingCsvInBase.getProcentUploadFileInBase() + " ======== procent ");

            writer.write("data: " + proc + "\n\n");

            writer.flush();


        }

//            do{
//                procent = parsingCsvInBase.getProcentUploadFileInBase(parsingCsvInBase.getCountAll());
//                System.out.println(parsingCsvInBase.getProcentUploadFileInBase(parsingCsvInBase.getCountAll()) + " ======== procent ");
//
//                writer.write("data: " + procent + "\n\n");
//
//                writer.flush();
//
//
//            } while (procent < 100);


        //writer.close();
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
