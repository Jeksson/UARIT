package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.io.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by jekss on 13.08.16.
 */
@Service
public class UploadCsvInBase extends Thread {

    @Resource
    CashingDB cashingDB;
    @Resource
    ProductService productService;

    @Autowired
    volatile ManufacturesNameService manufacturesNameService;
    @Resource
    CategoriesName1Service categoriesName1Service;
    @Resource
    CategoriesName2Service categoriesName2Service;
    @Resource
    CategoriesName3Service categoriesName3Service;
    @Resource
    CategoriesName4Service categoriesName4Service;
    @Resource
    CategoriesName5Service categoriesName5Service;

    private Product product = new Product();
    private Picture picture = new Picture();

    private String path;

    private String name;
    private BufferedReader bufferedReader = null;

    public UploadCsvInBase() {

    }

    public UploadCsvInBase(String nameFile, String path) {
        this.name = nameFile;
        this.path = path;
        System.out.println(path + " path uploadCsvInBase");
    }

    ThreadLocal<ManufacturesName> threadLocal = new ThreadLocal<ManufacturesName>();

    // cчетчик считаных строк из файла csv находится в setCsv();
    private volatile int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        int countin = 0;


        System.out.println(this.name + " this name");///////////////////////////////// сдесь теряется buffered reader
        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File(path + File.separator + this.name)),
                            "windows-1251"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            String mtp = "";

            while ((mtp = bufferedReader.readLine()) != null) {/////////////
                String[] s = mtp.split(";");

                for (int i = 0; i < s.length; i++) {
                    System.out.print(s[i] + " / ");
                }


                if (countin > 1) {

                    System.out.println(s.length + " s.length");

                    System.out.println(Integer.parseInt(s[0].trim()) + " id prod");
                    product.setId_product(Integer.parseInt(s[0].trim()));

                    System.out.println(s[1] + " name prod");
                    product.setName(s[1]);

                    System.out.println(Double.parseDouble(s[2].replace(',', '.')) + " price");
                    if (s[2].equals(null) || s[2].equals("")) {
                        product.setPrice_product(0.0);
                    } else if (!s[2].equals(null) || !s[2].equals("")) {
                        product.setPrice_product(Double.parseDouble(s[2].replace(',', '.')));
                    }

                    System.out.println(s[4] + " date added");
                    product.setDateAdded_product(s[4]);


                    System.out.println(s[5]);
                    if (cashingDB.getCashing(s[5], manufacturesNameService.getAll())) {
                        product.setManufacturesName_product(getManufacturesNameTL(s[5]));
                        getManufacturesNameList(true);
                    } else {
                        product.setManufacturesName_product(getManufacturesName(s[5]));
                    }
                    System.out.println(s[6]);
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

                    if (s[13].equals(null) || s[13].equals("")) {
                        picture.setaBoolean_picture(false);
                        picture.setUrl_picture(s[14]);
                        product.setPicture_product(picture);
                    } else {
                        picture.setaBoolean_picture(true);
                        picture.setUrl_picture(s[13]);
                        product.setPicture_product(picture);
                    }
//                    System.out.println(s[7] + " manufactures name");
//                if (manufacturesNameService.isNameManufacturesName(s[7])){
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
                }
                countin++;
                System.out.println(countin + " countin");
                count = countin;
                System.out.println(count + " count");
                System.out.println(product.toString());
                if (product.equals(null) || product == null) {
                    productService.addProduct(product);
                }

                System.out.println("--------------------------------------------------   " + count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //getFile(nameFile, request);
    }


//    // парсинг и загрузка файла + счетчик count;
//    public void setCsv(String nameFile, HttpServletRequest request) throws IOException {
//        int countin = 0;
//        String mtp = "";
//
//        System.out.println(nameFile);///////////////////////////////// сдесь теряется buffered reader
//        bufferedReader = parsingCsvInBase.getFile(nameFile, request);//////////////////
//        System.out.println(bufferedReader.readLine());////////////////
//        while ((mtp = bufferedReader.readLine()) != null){/////////////
//            String[] s = mtp.split(";");
//
//
//            countin++;
//            System.out.println(countin);
//            if (countin > 1) {
//
//                System.out.println(s.length);
//
//                product.setId_product(Integer.parseInt(s[0].trim()));
//
//                product.setName(s[1]);
//
//                if (s[2].equals(null) || s[2].equals("")) {
//                    product.setPrice_product(0.0);
//                } else if (!s[2].equals(null) || !s[2].equals("")) {
//                    product.setPrice_product(Double.parseDouble(s[2].replace(',', '.')));
//                }
//
//                product.setDateAdded_product(s[4]);
//
//
//                if (cashingDB.getCashing(s[5], getManufacturesNameList(false))) {
//                    product.setManufacturesName_product(getManufacturesName(s[5]));
//                    getManufacturesNameList(true);
//                } else {
//                    product.setManufacturesName_product(getManufacturesName(s[5]));
//                }
////                if (manufacturesNameService.isNameManufacturesName(s[7])){
////                    product.setManufacturesName_product(manufacturesNameService.addManufacturesName(getManufacturesName(s[7])));
////                } else product.setManufacturesName_product(manufacturesNameService.getByNameManufacturesName(s[7]));
////
////                if(categoriesName1Service.isNameCategoriesName(s[9])){
////                    product.setCategoriesName1_product(categoriesName1Service.addCategoriesName1(getCategoriesName1(s[9])));
////                } else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[9]));
////                if(categoriesName2Service.isNameCategoriesName(s[12])){
////                    product.setCategoriesName2_product(categoriesName2Service.addCategoriesName2(getCategoriesName2(s[12])));
////                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[12]));
////                if(categoriesName3Service.isNameCategoriesName(s[15])){
////                    product.setCategoriesName3_product(categoriesName3Service.addCategoriesName3(getCategoriesName3(s[15])));
////                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[15]));
////                if(categoriesName4Service.isNameCategoriesName(s[18])){
////                    product.setCategoriesName4_product(categoriesName4Service.addCategoriesName4(getCategoriesName4(s[18])));
////                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[18]));
////                if(categoriesName5Service.isNameCategoriesName(s[21])){
////                    product.setCategoriesName5_product(categoriesName5Service.addCategoriesName5(getCategoriesName5(s[21])));
////                }else product.setCategoriesName1_product(categoriesName1Service.getByNameCategoriesName1(s[21]));
//                if (s[6].equals(null) || s[6].equals("")) {
//                    product.setCategoriesName1_product(getCategoriesName1(""));
//                } else {
//                    if (cashingDB.getCashing(s[6], getCategoriesName1List(false))) {
//                        product.setCategoriesName1_product(getCategoriesName1(s[6]));
//                        getCategoriesName1List(true);
//                    } else {
//                        product.setCategoriesName1_product(getCategoriesName1(s[6]));
//                    }
//                }
//
//
//                if (s[7].equals(null) || s[7].equals("")) {
//                    product.setCategoriesName2_product(getCategoriesName2(""));
//                } else {
//                    if (cashingDB.getCashing(s[7], getCategoriesName2List(false))) {
//                        product.setCategoriesName2_product(getCategoriesName2(s[7]));
//                        getCategoriesName2List(true);
//                    } else {
//                        product.setCategoriesName2_product(getCategoriesName2(s[7]));
//                    }
//                }
//
//                if (s[8].equals(null) || s[8].equals("")) {
//                    product.setCategoriesName3_product(getCategoriesName3(""));
//                } else {
//                    if (cashingDB.getCashing(s[8], getCategoriesName3List(false))) {
//                        product.setCategoriesName3_product(getCategoriesName3(s[8]));
//                        getCategoriesName3List(true);
//                    } else {
//                        product.setCategoriesName3_product(getCategoriesName3(s[8]));
//                    }
//                }
//
//                if (s[9].equals(null) || s[9].equals("")) {
//                    product.setCategoriesName4_product(getCategoriesName4(""));
//                } else {
//                    if (cashingDB.getCashing(s[9], getCategoriesName4List(false))) {
//                        product.setCategoriesName4_product(getCategoriesName4(s[9]));
//                        getCategoriesName4List(true);
//                    } else {
//                        product.setCategoriesName4_product(getCategoriesName4(s[9]));
//                    }
//                }
//
//                if (s[10].equals(null) || s[10].equals("")) {
//                    product.setCategoriesName5_product(getCategoriesName5(""));
//                } else {
//                    if (cashingDB.getCashing(s[10], getCategoriesName5List(false))) {
//                        product.setCategoriesName5_product(getCategoriesName5(s[10]));
//                        getCategoriesName5List(true);
//                    } else {
//                        product.setCategoriesName5_product(getCategoriesName5(s[10]));
//                    }
//                }
//
//                if (s[13].equals(null) || s[13].equals("")) {
//                    picture.setaBoolean_picture(false);
//                    picture.setUrl_picture(s[14]);
//                    product.setPicture_product(picture);
//                } else {
//                    picture.setaBoolean_picture(true);
//                    picture.setUrl_picture(s[13]);
//                    product.setPicture_product(picture);
//                }
//            }
//            count = countin;
//            System.out.println(productService.addProduct(product));
//            System.out.println("--------------------------------------------------   " + count);
//        }
//        //getFile(nameFile, request);
//    }

    CopyOnWriteArrayList<ManufacturesName> manufacturesNameList;
    List<CategoriesName1> categoriesName1List;
    List<CategoriesName2> categoriesName2List;
    List<CategoriesName3> categoriesName3List;
    List<CategoriesName4> categoriesName4List;
    List<CategoriesName5> categoriesName5List;


    CopyOnWriteArrayList<ManufacturesName> getManufacturesNameList(boolean upgrade) {
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

    ManufacturesName getManufacturesNameTL(String name) {

        ManufacturesName manufacturesName = threadLocal.get();
        if (manufacturesName == null) {
            manufacturesName = getManufacturesName(name);
            threadLocal.set(manufacturesName);
        }
        return manufacturesName;
    }

    ManufacturesName getManufacturesName(String name) {
        ManufacturesName manufacturesName = manufacturesNameService.getByNameManufacturesName(name);
        if (manufacturesName == null) {
            manufacturesName = new ManufacturesName();
            manufacturesName.setName(name);
            manufacturesName = manufacturesNameService.addManufacturesName(manufacturesName);
        }
        return manufacturesName;
    }

    CategoriesName1 getCategoriesName1(String name) {
        CategoriesName1 categoriesName1 = categoriesName1Service.getByNameCategoriesName1(name);
        if (categoriesName1 == null) {
            categoriesName1 = new CategoriesName1();
            categoriesName1.setName(name);
            categoriesName1 = categoriesName1Service.addCategoriesName1(categoriesName1);
        }
        return categoriesName1;
    }

    CategoriesName2 getCategoriesName2(String name) {
        CategoriesName2 categoriesName2 = categoriesName2Service.getByNameCategoriesName2(name);
        if (categoriesName2 == null) {
            categoriesName2 = new CategoriesName2();
            categoriesName2.setName(name);
            categoriesName2 = categoriesName2Service.addCategoriesName2(categoriesName2);
        }
        return categoriesName2;
    }

    CategoriesName3 getCategoriesName3(String name) {
        CategoriesName3 categoriesName3 = categoriesName3Service.getByNameCategoriesName3(name);
        if (categoriesName3 == null) {
            categoriesName3 = new CategoriesName3();
            categoriesName3.setName(name);
            categoriesName3 = categoriesName3Service.addCategoriesName3(categoriesName3);
        }
        return categoriesName3;
    }

    CategoriesName4 getCategoriesName4(String name) {
        CategoriesName4 categoriesName4 = categoriesName4Service.getByNameCategoriesName4(name);
        if (categoriesName4 == null) {
            categoriesName4 = new CategoriesName4();
            categoriesName4.setName(name);
            categoriesName4 = categoriesName4Service.addCategoriesName4(categoriesName4);
        }
        return categoriesName4;
    }

    CategoriesName5 getCategoriesName5(String name) {
        CategoriesName5 categoriesName5 = categoriesName5Service.getByNameCategoriesName5(name);
        if (categoriesName5 == null) {
            categoriesName5 = new CategoriesName5();
            categoriesName5.setName(name);
            categoriesName5 = categoriesName5Service.addCategoriesName5(categoriesName5);
        }
        return categoriesName5;
    }


}
