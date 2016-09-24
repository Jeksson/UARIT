package com.jekss.controller;

import com.jekss.entityes.CategoriesName1;
import com.jekss.entityes.CategoriesName2;
import com.jekss.entityes.Product;
import com.jekss.entityes.ProductUtil;
import com.jekss.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jekss on 17.07.16.
 */
@Controller
@RequestMapping("/")
public class HomeController {


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



    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {

        return "home_v1";
    }

    @RequestMapping(value = "catname1")
    @ResponseBody
    public List<String> categoryName1(){
        List<String> res = new ArrayList<>();
        List<CategoriesName1> catName1 = categoriesName1Service.getAll();

        for (CategoriesName1 cn1 :
                catName1) {
            if(cn1.getName() != null ){
                res.add(cn1.getName().replaceAll("\"", ""));
            }
        }
        return res;
    }

    @RequestMapping(value = "catname2")
    @ResponseBody
    public List<String> categoryName2(@RequestParam(value = "name") String categ1Name){
        List<String> res = new ArrayList<>();
        List<Product> products = productService.getAll();

        for (Product pr : products) {

        }
        return res;
    }




}
