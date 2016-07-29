package com.jekss.controller;

import com.jekss.entityes.ProductUtil;
import com.jekss.service.ManufacturesNameService;
import com.jekss.service.ProductService;
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

    @Resource
    private ManufacturesNameService manufacturesNameService;



    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {
//        model.addAttribute("qwerty", productService.addProduct(ProductUtil.createProductAll())).toString();
//        model.addAttribute("asdf", manufacturesNameService.getByIdManufacturesName(1).toString());
        return "home_v1";
    }


}
