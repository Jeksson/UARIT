package com.jekss.controller;

/**
 * Created by jekss on 18.07.16.
 */

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.jekss.util.GetFileInPath;
import com.jekss.util.ParsingCsvInBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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


        //parsingCsvInBase.getSavePath(httpServletRequest);
        model.addAttribute("lists", getFileInPath.getFileNameFromFolder(parsingCsvInBase.getSavePath(httpServletRequest)));

        return "upload";
    }

    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public
    @ResponseBody
    String uploadFileHandler(@RequestParam("file") MultipartFile file,
                             HttpServletRequest request) {
        fileName = file.getOriginalFilename();
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                File fileSaveDir = new File(parsingCsvInBase.getSavePath(request));
                if (!fileSaveDir.exists()) {
                    fileSaveDir.mkdir();
                }
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(fileSaveDir + File.separator + fileName));
                stream.write(bytes);
                stream.close();

                logger.info("Server File Location="
                        + fileSaveDir.getAbsolutePath());

                return "You successfully uploaded file=" + fileName;
            } catch (Exception e) {
                return "You failed to upload " + fileName + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + fileName
                    + " because the file was empty.";
        }
    }


    // ajax               запускает метод загрузки файла в базу
    @RequestMapping(value = "uploadCsv", method = RequestMethod.GET)
    @ResponseBody
    public void addInBaseFile(HttpServletRequest httpServletRequest) throws IOException {

        parsingCsvInBase.setCsv(fileName, httpServletRequest);

    }


    //  ajax             запускает метод вычитания процента и отдает значение на view пользователя
    @RequestMapping(value = "uploadprocent", method = RequestMethod.GET)
    @ResponseBody
    public Set<Integer> getProcentUploadInBase() throws IOException, InterruptedException {

        Set<Integer> result = new HashSet<>();
        result.add(parsingCsvInBase.getProcentUploadFileInBase());
        return result;

    }

    //ajax            запускает метод который подсчитывает общее колличество строк в файле
    @RequestMapping(value = "uploadcountall", method = RequestMethod.GET)
    @ResponseBody
    public void getCountAll(HttpServletRequest httpServletRequest) throws IOException {

        parsingCsvInBase.getCountAll(fileName, httpServletRequest);

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
