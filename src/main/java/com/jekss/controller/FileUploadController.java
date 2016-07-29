package com.jekss.controller;

/**
 * Created by jekss on 18.07.16.
 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.jekss.util.ParsingCsvInBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Handles requests for the application file upload requests
 */
@Controller
public class FileUploadController {

    @Resource
    ParsingCsvInBase parsingCsvInBase;

    String fileName;

    private static final Logger logger = LoggerFactory
            .getLogger(FileUploadController.class);

    /**
     * Upload single file using Spring Controller
     */

    @RequestMapping(value = "uploadfile", method = RequestMethod.GET)
    String uploadPage(Model model) {

        return "upload";
    }


    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public
    @ResponseBody
    String uploadFileHandler(@RequestParam("name") String name,
                             @RequestParam("file") MultipartFile file,
                             HttpServletRequest request) {
        fileName = name;
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                String appPath = request.getServletContext().getRealPath("");
                String savePath = appPath + File.separator + "uploadFiles";


                File fileSaveDir = new File(savePath);
                if (!fileSaveDir.exists()) {
                    fileSaveDir.mkdir();
                }
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(fileSaveDir + File.separator + name));
                stream.write(bytes);
                stream.close();

                logger.info("Server File Location="
                        + fileSaveDir.getAbsolutePath());

                return "You successfully uploaded file=" + name;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name
                    + " because the file was empty.";
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
    @RequestMapping(value = "/uploadCsv", method = RequestMethod.GET)
    @ResponseBody
    public String addInBaseFile(HttpServletRequest httpServletRequest) throws IOException {

        System.out.println(fileName);
        parsingCsvInBase.setCsv(fileName, httpServletRequest);
        return null;
    }
}
