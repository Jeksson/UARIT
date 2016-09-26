package com.jekss.controller;

import com.jekss.entityes.Product;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
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
        List<Product> lp = productService.getCategoriesName2InCategoriesName1("Расходники, Носители информации");
        System.out.println(lp.size());
        for (Product p :
                lp) {
            System.out.println(p.getCategoriesName2_product());
        }

        return "home_v1";
    }








}
