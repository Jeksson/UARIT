package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import com.jekss.util.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jekss on 20.07.16.
 */
@Service
public class ParsingCsvInBase {

    private Product product = new Product();
    private ManufacturesName manufacturesName;
    private CategoriesName1 categoriesName1;
    private CategoriesName2 categoriesName2;
    private CategoriesName3 categoriesName3;
    private CategoriesName4 categoriesName4;
    private CategoriesName5 categoriesName5;
    private Picture picture = new Picture();


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


    public void setCsv(String nameFile, HttpServletRequest request) throws IOException {
        String appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + File.separator + "uploadFiles";
        File csv = new File(savePath + File.separator + nameFile);
        InputStream inputStream = new FileInputStream(csv);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "windows-1251");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String mtp = "";
        int count = 0;
        while ((mtp = bufferedReader.readLine()) != null) {
            String[] s = mtp.split(";|(\")+");
            count++;
            if (count > 1) {

                product.setId_product(Integer.parseInt(s[0].trim()));

                product.setName(s[2]);

                if (s[4].equals(null) || s[4].equals("")) {
                    product.setPrice_product(0.0);
                    System.out.println(s[4].trim()+ "<<<<<<<<<< тупо пустое поле" );
                } else if (!s[4].equals(null) || !s[4].equals("")){

                    product.setPrice_product(Double.parseDouble(s[4].replace(',', '.')));
                }
                product.setDateAdded_product(s[6]);


                if (cashingDB.getCashing(s[7], getManufacturesNameList(false))) {
                    product.setManufacturesName_product(getManufacturesName(s[7]));
                    getManufacturesNameList(true);
                } else {
                    product.setManufacturesName_product(getManufacturesName(s[7]));
                }
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

                if (cashingDB.getCashing(s[9], getCategoriesName1List(false))) {
                    product.setCategoriesName1_product(getCategoriesName1(s[9]));
                    getCategoriesName1List(true);
                } else {
                    product.setCategoriesName1_product(getCategoriesName1(s[9]));
                }

                if (cashingDB.getCashing(s[12], getCategoriesName2List(false))) {
                    product.setCategoriesName2_product(getCategoriesName2(s[12]));
                    getCategoriesName2List(true);
                } else {
                    product.setCategoriesName2_product(getCategoriesName2(s[12]));
                }

                if (cashingDB.getCashing(s[15], getCategoriesName3List(false))) {
                    product.setCategoriesName3_product(getCategoriesName3(s[15]));
                    getCategoriesName3List(true);
                } else {
                    product.setCategoriesName3_product(getCategoriesName3(s[15]));
                }

                if (cashingDB.getCashing(s[18], getCategoriesName4List(false))) {
                    product.setCategoriesName4_product(getCategoriesName4(s[18]));
                    getCategoriesName4List(true);
                } else {
                    product.setCategoriesName4_product(getCategoriesName4(s[18]));
                }

                if (cashingDB.getCashing(s[21], getCategoriesName5List(false))) {
                    product.setCategoriesName5_product(getCategoriesName5(s[21]));
                    getCategoriesName5List(true);
                } else {
                    product.setCategoriesName5_product(getCategoriesName5(s[21]));
                }

                picture.setUrl_picture(s[25]);
                picture.setaBoolean_picture(true);
                product.setPicture_product(picture);
            }
            //System.out.println(productService.addProduct(product));
            System.out.println("--------------------------------------------------   " + count);
        }
    }
    List<ManufacturesName> getManufacturesNameList(boolean upgrade){
        if (manufacturesNameList == null || upgrade == true){
            manufacturesNameList = manufacturesNameService.getAll();
            return manufacturesNameList;
        } else return manufacturesNameList;

    }
    List<CategoriesName1> getCategoriesName1List(boolean upgrade){
        if (categoriesName1List == null || upgrade == true){
            categoriesName1List = categoriesName1Service.getAll();
            return categoriesName1List;
        } else return categoriesName1List;

    }
    List<CategoriesName2> getCategoriesName2List(boolean upgrade){
        if (categoriesName2List == null || upgrade == true){
            categoriesName2List = categoriesName2Service.getAll();
            return categoriesName2List;
        } else return categoriesName2List;

    }
    List<CategoriesName3> getCategoriesName3List(boolean upgrade){
        if (categoriesName3List == null || upgrade == true){
            categoriesName3List = categoriesName3Service.getAll();
            return categoriesName3List;
        } else return categoriesName3List;

    }
    List<CategoriesName4> getCategoriesName4List(boolean upgrade){
        if (categoriesName4List == null || upgrade == true){
            categoriesName4List = categoriesName4Service.getAll();
            return categoriesName4List;
        } else return categoriesName4List;

    }
    List<CategoriesName5> getCategoriesName5List(boolean upgrade){
        if (categoriesName5List == null || upgrade == true){
            categoriesName5List = categoriesName5Service.getAll();
            return categoriesName5List;
        } else return categoriesName5List;

    }

    ManufacturesName getManufacturesName(String name) {
        manufacturesName = manufacturesNameService.getByNameManufacturesName(name);
        if(manufacturesName == null){
            manufacturesName = new ManufacturesName();
            manufacturesName.setName(name);
            manufacturesName = manufacturesNameService.addManufacturesName(manufacturesName);
        }
        return manufacturesName;
    }
    CategoriesName1 getCategoriesName1(String name) {
        //categoriesName1 = categoriesName1Service.getByNameCategoriesName1(name);
        if (categoriesName1 == null){
            categoriesName1 = new CategoriesName1();
            categoriesName1.setName(name);
            categoriesName1 = categoriesName1Service.addCategoriesName1(categoriesName1);
        }
        return categoriesName1;
    }
    CategoriesName2 getCategoriesName2(String name) {
        categoriesName2 = categoriesName2Service.getByNameCategoriesName2(name);
        if (categoriesName2 == null){
            categoriesName2 = new CategoriesName2();
            categoriesName2.setName(name);
            categoriesName2 = categoriesName2Service.addCategoriesName2(categoriesName2);
        }
        return categoriesName2;
    }
    CategoriesName3 getCategoriesName3(String name) {
        categoriesName3 = categoriesName3Service.getByNameCategoriesName3(name);
        if (categoriesName3 == null){
            categoriesName3 = new CategoriesName3();
            categoriesName3.setName(name);
            categoriesName3 = categoriesName3Service.addCategoriesName3(categoriesName3);
        }
        return categoriesName3;
    }
    CategoriesName4 getCategoriesName4(String name) {
        categoriesName4 = categoriesName4Service.getByNameCategoriesName4(name);
        if (categoriesName4 == null){
            categoriesName4 = new CategoriesName4();
            categoriesName4.setName(name);
            categoriesName4 = categoriesName4Service.addCategoriesName4(categoriesName4);
        }
        return categoriesName4;
    }
    CategoriesName5 getCategoriesName5(String name) {
        categoriesName5 = categoriesName5Service.getByNameCategoriesName5(name);
        if (categoriesName5 == null){
            categoriesName5 = new CategoriesName5();
            categoriesName5.setName(name);
            categoriesName5 = categoriesName5Service.addCategoriesName5(categoriesName5);
        }
        return categoriesName5;
    }



}
