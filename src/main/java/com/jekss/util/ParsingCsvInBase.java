package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import com.jekss.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
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


    String fileName;


    @Resource
    private Environment env;

    private volatile BufferedReader bufferedReader;

    private Product product = new Product();
    private ManufacturesName manufacturesName;
    private CategoriesName1 categoriesName1;
    private CategoriesName2 categoriesName2;
    private CategoriesName3 categoriesName3;
    private CategoriesName4 categoriesName4;
    private CategoriesName5 categoriesName5;
    private Picture picture = new Picture();

    // cчетчик считаных строк из файла csv находится в setCsv();
    private volatile int count = 0;

    private volatile int countAll;


    @Resource
    private ProductService productService;
    @Resource
    private ManufacturesNameService manufacturesNameService;
    @Resource
    private CategoriesName1Service categoriesName1Service;
    @Resource
    private CategoriesName2Service categoriesName2Service;
    @Resource
    private CategoriesName3Service categoriesName3Service;
    @Resource
    private CategoriesName4Service categoriesName4Service;
    @Resource
    private CategoriesName5Service categoriesName5Service;
    @Resource
    private CashingDB cashingDB;


    private static List<ManufacturesName> manufacturesNameList;
    private static List<CategoriesName1> categoriesName1List;
    private static List<CategoriesName2> categoriesName2List;
    private static List<CategoriesName3> categoriesName3List;
    private static List<CategoriesName4> categoriesName4List;
    private static List<CategoriesName5> categoriesName5List;

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


    // парсинг и загрузка файла + счетчик count;

    public void setCsv(String path) {
        System.out.println(" set CSV in work");
        String mtp = "";
        //setBufferedReader(path);

        try {
            while ((mtp = getBufferedReader().readLine()) != null) {
                System.out.println(" while in work");
                String[] s = mtp.split(";");
                setCount(getCount() + 1);

                if (getCount() > 1) {

                    System.out.println(s.length);

                    product.setId_product(Integer.parseInt(s[0].trim()));
                    System.out.println(s[1] + " 1");
                    product.setName(s[1] + " 1");

                    System.out.println(s[2] + " 2");
                    if (s[2].equals(null) || s[2].equals("")) {
                        product.setPrice_product(0.0);
                    } else if (!s[2].equals(null) || !s[2].equals("")) {
                        product.setPrice_product(Double.parseDouble(s[2].replace(',', '.')));
                    }

                    System.out.println(s[4] + " 4");
                    product.setDateAdded_product(s[4]);

                    System.out.println(s[5] + " 5");
                    if (cashingDB.getCashing(s[5], getManufacturesNameList(false))) {
                        product.setManufacturesName_product(getManufacturesName(s[5]));
                        getManufacturesNameList(true);
                    } else {
                        product.setManufacturesName_product(getManufacturesName(s[5]));
                    }
//                                    if (manufacturesNameService.isNameManufacturesName(s[7])){
                    //                    product.setManufacturesName_product(manufacturesNameService.addManufacturesName(getManufacturesName(s[7])));
                    //                } else product.setManufacturesName_product(manufacturesNameService.getByNameManufacturesName(s[7]));
                    //
                    //                if(categoriesName1Service.isNameCategoriesName(s[9])){
                    //                    product.setCategoriesName1_product(categoriesName1Service.addCategoriesName1(getCategoriesName1(s[9])));
                    //                } else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[9]));
                    //                if(categoriesName2Service.isNameCategoriesName(s[12])){
                    //                    product.setCategoriesName2_product(categoriesName2Service.addCategoriesName2(getCategoriesName2(s[12])));
                    //                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[12]));
                    //                if(categoriesName3Service.isNameCategoriesName(s[15])){
                    //                    product.setCategoriesName3_product(categoriesName3Service.addCategoriesName3(getCategoriesName3(s[15])));
                    //                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[15]));
                    //                if(categoriesName4Service.isNameCategoriesName(s[18])){
                    //                    product.setCategoriesName4_product(categoriesName4Service.addCategoriesName4(getCategoriesName4(s[18])));
                    //                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[18]));
                    //                if(categoriesName5Service.isNameCategoriesName(s[21])){
                    //                    product.setCategoriesName5_product(categoriesName5Service.addCategoriesName5(getCategoriesName5(s[21])));
                    //                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[21]));
                    //System.out.println(s[6] + "6");
                    if (s[6].equals(null) || s[6].equals("")) {
                        product.setCategoriesName1_product(getCategoriesName1(""));
                    } else {
                        if (cashingDB.getCashing(s[6], getCategoriesName1List(false))) {
                            product.setCategoriesName1_product(getCategoriesName1(s[6]));
                            getCategoriesName1List(true);
                        } else {
                            product.setCategoriesName1_product(getCategoriesName1(s[6]));
                        }
                    }

                    System.out.println(s[7] + " 7");
                    if (s[7].equals(null) || s[7].equals("")) {
                        product.setCategoriesName2_product(getCategoriesName2(""));
                    } else {
                        if (cashingDB.getCashing(s[7], getCategoriesName2List(false))) {
                            product.setCategoriesName2_product(getCategoriesName2(s[7]));
                            getCategoriesName2List(true);
                        } else {
                            product.setCategoriesName2_product(getCategoriesName2(s[7]));
                        }
                    }

                    System.out.println(s[8] + " 8");
                    if (s[8].equals(null) || s[8].equals("")) {
                        product.setCategoriesName3_product(getCategoriesName3(""));
                    } else {
                        if (cashingDB.getCashing(s[8], getCategoriesName3List(false))) {
                            product.setCategoriesName3_product(getCategoriesName3(s[8]));
                            getCategoriesName3List(true);
                        } else {
                            product.setCategoriesName3_product(getCategoriesName3(s[8]));
                        }
                    }

                    System.out.println(s[9] + " 9");
                    if (s[9].equals(null) || s[9].equals("")) {
                        product.setCategoriesName4_product(getCategoriesName4(""));
                    } else {
                        if (cashingDB.getCashing(s[9], getCategoriesName4List(false))) {
                            product.setCategoriesName4_product(getCategoriesName4(s[9]));
                            getCategoriesName4List(true);
                        } else {
                            product.setCategoriesName4_product(getCategoriesName4(s[9]));
                        }
                    }

                    System.out.println(s[10] + " 10");
                    if (s[10].equals(null) || s[10].equals("")) {
                        product.setCategoriesName5_product(getCategoriesName5(""));
                    } else {
                        if (cashingDB.getCashing(s[10], getCategoriesName5List(false))) {
                            product.setCategoriesName5_product(getCategoriesName5(s[10]));
                            getCategoriesName5List(true);
                        } else {
                            product.setCategoriesName5_product(getCategoriesName5(s[10]));
                        }
                    }

                    System.out.println(s[13] + " 13");
                    if (s[13].equals(null) || s[13].equals("")) {
                        picture.setaBoolean_picture(false);
                        picture.setUrl_picture(s[14]);
                        product.setPicture_product(picture);
                    } else {
                        picture.setaBoolean_picture(true);
                        picture.setUrl_picture(s[13]);
                        product.setPicture_product(picture);
                    }
                }

                productService.addProduct(product);

                System.out.println(productService.addProduct(product));
                System.out.println("--------------------------------------------------   " + getCount());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    // берет count & countAll и вычисляет процент прохода загрузки файла в базу
    @Async
    public int getProcentUploadFileInBase() {
        System.out.println(getCountAll() + " get procent upload method");
        System.out.println(" in procent upload file in base");
        System.out.println(" count = " + getCount() + " get count //////");
        int result = 0;
        if (getCount() != 0) {
            result = (getCount() * 100) / getCountAll();
        } else System.out.println(" count = " + getCount() + "//////");


        System.out.println(result + "||||||||||||||||||||||||||||||||||||");
        return result;
    }

    // открывает файл и считает количчество строк которые пишутся в countAll;

    public void setCountAll(String nameFile, HttpServletRequest request){
        int couAll = 0;
        System.out.println(nameFile + " set count all");
//bufferedReader = getBufferedReader(nameFile, request);
        try {
            while (getBufferedReader().readLine() != null) {
                couAll++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } finally {
                try {
                    bufferedReader.reset();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        this.countAll = couAll;
    }

    public void setCountAll(){
        int couAll = 0;

        //bufferedReader = getBufferedReader(path);
        try {
            while (getBufferedReader().readLine() != null) {
                couAll++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        this.countAll = couAll;
    }

    public int getCountAll() {
        return countAll;
    }

    // открывает соединение к файлу и отдает bufferedReader
    public void setBufferedReader(String nameFile, HttpServletRequest request) {
        System.out.println(nameFile + " name file" + " get buffered reader");
//        System.out.println(getSavePath(request) + File.separator + nameFile + " path");
        if (bufferedReader == null) {
            try {
                bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File(getSavePath(request) + File.separator + nameFile)),
                                "windows-1251"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void setBufferedReader(String path) {
        System.out.println(path + " path" + " get buffered reader");

        if (bufferedReader == null || bufferedReader.equals(null)) {
            try {
                    this.bufferedReader = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(
                                            new File(path)),
                                    "windows-1251"));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }


    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public String getSavePath(HttpServletRequest request) {
        //System.out.println(request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE) + "то что записалось в переменную");
        return request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE);
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    List<ManufacturesName> getManufacturesNameList(boolean upgrade) {
        if (manufacturesNameList == null || upgrade == true) {
            manufacturesNameList = manufacturesNameService.getAll();
            return manufacturesNameList;
        } else return manufacturesNameList;

    }

    List<CategoriesName1> getCategoriesName1List(boolean upgrade) {
        if (categoriesName1List == null || upgrade == true) {
            categoriesName1List = categoriesName1Service.getAll();
            return categoriesName1List;
        } else return categoriesName1List;

    }

    List<CategoriesName2> getCategoriesName2List(boolean upgrade) {
        if (categoriesName2List == null || upgrade == true) {
            categoriesName2List = categoriesName2Service.getAll();
            return categoriesName2List;
        } else return categoriesName2List;

    }

    List<CategoriesName3> getCategoriesName3List(boolean upgrade) {
        if (categoriesName3List == null || upgrade == true) {
            categoriesName3List = categoriesName3Service.getAll();
            return categoriesName3List;
        } else return categoriesName3List;

    }

    List<CategoriesName4> getCategoriesName4List(boolean upgrade) {
        if (categoriesName4List == null || upgrade == true) {
            categoriesName4List = categoriesName4Service.getAll();
            return categoriesName4List;
        } else return categoriesName4List;

    }

    List<CategoriesName5> getCategoriesName5List(boolean upgrade) {
        if (categoriesName5List == null || upgrade == true) {
            categoriesName5List = categoriesName5Service.getAll();
            return categoriesName5List;
        } else return categoriesName5List;

    }

    ManufacturesName getManufacturesName(String name) {
        manufacturesName = manufacturesNameService.getByNameManufacturesName(name);
        if (manufacturesName == null) {
            manufacturesName = new ManufacturesName();
            manufacturesName.setName(name);
            manufacturesName = manufacturesNameService.addManufacturesName(manufacturesName);
        }
        return manufacturesName;
    }

    CategoriesName1 getCategoriesName1(String name) {
        //categoriesName1 = categoriesName1Service.getByNameCategoriesName1(name);
        if (categoriesName1 == null) {
            categoriesName1 = new CategoriesName1();
            categoriesName1.setName(name);
            categoriesName1 = categoriesName1Service.addCategoriesName1(categoriesName1);
        }
        return categoriesName1;
    }

    CategoriesName2 getCategoriesName2(String name) {
        categoriesName2 = categoriesName2Service.getByNameCategoriesName2(name);
        if (categoriesName2 == null) {
            categoriesName2 = new CategoriesName2();
            categoriesName2.setName(name);
            categoriesName2 = categoriesName2Service.addCategoriesName2(categoriesName2);
        }
        return categoriesName2;
    }

    CategoriesName3 getCategoriesName3(String name) {
        categoriesName3 = categoriesName3Service.getByNameCategoriesName3(name);
        if (categoriesName3 == null) {
            categoriesName3 = new CategoriesName3();
            categoriesName3.setName(name);
            categoriesName3 = categoriesName3Service.addCategoriesName3(categoriesName3);
        }
        return categoriesName3;
    }

    CategoriesName4 getCategoriesName4(String name) {
        categoriesName4 = categoriesName4Service.getByNameCategoriesName4(name);
        if (categoriesName4 == null) {
            categoriesName4 = new CategoriesName4();
            categoriesName4.setName(name);
            categoriesName4 = categoriesName4Service.addCategoriesName4(categoriesName4);
        }
        return categoriesName4;
    }

    CategoriesName5 getCategoriesName5(String name) {
        categoriesName5 = categoriesName5Service.getByNameCategoriesName5(name);
        if (categoriesName5 == null) {
            categoriesName5 = new CategoriesName5();
            categoriesName5.setName(name);
            categoriesName5 = categoriesName5Service.addCategoriesName5(categoriesName5);
        }
        return categoriesName5;
    }

}
