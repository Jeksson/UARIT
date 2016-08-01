package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.service.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jekss on 26.07.16.
 */

@Service
public class CashingDB {
    boolean aBoolean = false;

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
    private CategoriesName5Service categoriesName5ervice;
    @Resource
    private CategoriesName6Service categoriesName6Service;


    public <T> boolean getCashing(String name, List<T> list) {
        List listNew = list;

        for (int i = 1; i < (listNew.size()); i++) {
            BaseClass baseClass = (BaseClass) list.get(i);
            //System.out.println(baseClass.getName()+"+++++= " + i);
            if (baseClass.getName()!=name) {aBoolean = true;}
            else aBoolean = false;
        }
        return aBoolean;
    }

    public <T> Object getObjectIsEntity(T val) {
        Object o = new Object();
        if (val instanceof Product) {
            o = new Product();
        } else if (val instanceof CategoriesName1) {
            o = new CategoriesName1();
        } else if (val instanceof CategoriesName2) {
            o = new CategoriesName2();
        } else if (val instanceof CategoriesName3) {
            o = new CategoriesName3();
        } else if (val instanceof CategoriesName4) {
            o = new CategoriesName4();
        } else if (val instanceof CategoriesName5) {
            o = new CategoriesName5();
        } else if (val instanceof CategoriesName6) {
            o = new CategoriesName6();
        } else if (val instanceof ManufacturesName) {
            o = new ManufacturesName();
        }
        return o;
    }

    public <T> Object getObjectIsServices(T val){

        if (val instanceof ProductService){
            return productService;
        }else if (val instanceof ManufacturesNameService){
            return manufacturesNameService;
        }else if (val instanceof CategoriesName1Service){
            return categoriesName1Service;
        }else if (val instanceof CategoriesName2Service){
            return categoriesName2Service;
        }else if (val instanceof CategoriesName3Service){
            return categoriesName3Service;
        }else if (val instanceof CategoriesName4Service){
            return categoriesName4Service;
        }else if (val instanceof CategoriesName5Service){
            return categoriesName5ervice;
        }else if (val instanceof CategoriesName6Service){
            return categoriesName6Service;
        }

        return null;

    }

}
