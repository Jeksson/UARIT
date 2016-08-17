package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import com.jekss.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by jekss on 20.07.16.
 */
@Service
@PropertySource("classpath:app.properties")
public class ParsingCsvInBase {

    private static final String PATH_IN_FILE = "path.in.file";

    private String fileName;



    //счетчик всех строк(сколько есть в файле) в csv находится в getCountAll();
    private int countAll = 0;


    //вынес логику из контроллера
    public boolean uploadFile(MultipartFile multipartFile, HttpServletRequest request) {
        BufferedOutputStream stream = null;

        System.out.println("+++++++++++++===");

        fileName = multipartFile.getOriginalFilename();
        System.out.println(fileName);
        if (!multipartFile.isEmpty()) {


            try {
                byte[] bytes = multipartFile.getBytes();

                File fileSaveDir = new File(getSavePath(request));
                if (!fileSaveDir.exists()) {
                    fileSaveDir.mkdir();
                }
                stream = new BufferedOutputStream(
                        new FileOutputStream(fileSaveDir + File.separator + fileName));
                stream.write(bytes);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return true;

        } else {
            return false;
        }
    }


    //метод определения расширения файла
    public String getFileExtension(MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return " расширение не найдено";
    }




    // берет count & countAll и вычисляет процент прохода загрузки файла в базу
    public int getProcentUploadFileInBase(int countAll, int count) throws InterruptedException {

        int result;
        result = countAll / (count * 100);

        System.out.println(result + "||||||||||||||||||||||||||||||||||||");
        return result;
    }

    // открывает файл и считает количчество строк которые пишутся в countAll;
    public synchronized int getCountAll(String nameFile, HttpServletRequest request) throws IOException {
int couAll = 0;
        BufferedReader bufferedReader1 = getFile(nameFile, request);
        while (bufferedReader1.readLine() != null) {
            couAll++;
        }
countAll = couAll;
        //getFile(nameFile,request).close();
        System.out.println(countAll + " count all");
        return countAll;
    }

    // открывает соединение к файлу и отдает bufferedReader
    BufferedReader getFile(String nameFile, HttpServletRequest request) throws UnsupportedEncodingException, FileNotFoundException {

        System.out.println(getSavePath(request) + File.separator + nameFile);
        if (bufferedReader == null) {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File(getSavePath(request) + File.separator + nameFile)),
                            "windows-1251"));
            return bufferedReader;
        } else return bufferedReader;
    }

    public String getSavePath(HttpServletRequest request) {
        //System.out.println(request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE) + "то что записалось в переменную");
        return request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE);
    }
    @Resource
    private Environment env;

    private volatile BufferedReader bufferedReader;
}
