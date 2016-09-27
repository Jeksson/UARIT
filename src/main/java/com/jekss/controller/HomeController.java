package com.jekss.controller;

import com.jekss.entityes.Product;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jekss on 17.07.16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {
        Product lp = productService.getCategoriesName1("Расходники, Носители информации");
        System.out.println(productService.getByNameProduct("\"Наушники Defender Pulse 430 black-purple\"").getCategoriesName1());
//        for (Product p :
//                productService.getAll()) {
//            System.out.println(p.getName());
//        }
        //System.out.println(lp.getCategoriesName2());


        return "home_v1";
    }








}
