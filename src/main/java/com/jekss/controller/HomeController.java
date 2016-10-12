package com.jekss.controller;


import com.jekss.entityes.Product;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by jekss on 17.07.16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Resource
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {
        for (String p :
                productService.getCategName1All()) {
            System.out.println(p);
        }

        for (Product p :
                productService.getAll()) {
            System.out.println(p.getName());
        }


        return "home_v1";
    }








}
