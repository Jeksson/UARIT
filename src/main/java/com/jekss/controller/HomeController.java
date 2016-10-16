package com.jekss.controller;


import com.jekss.entityes.Product;
import com.jekss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map <String, List<String>> cat2Map = new HashMap<>();

        for (String s : productService.getCategName1All()) {

            cat2Map.put(s, productService.getCategoriesName2(s));
        }

        model.addAttribute("listCateg1", productService.getCategName1All());
        model.addAttribute("mapCateg2", cat2Map);
        return "home_v1";
    }


    @RequestMapping(value = "catname1")
    @ResponseBody
    public List<String> catName1() {

        List<String> res = productService.getCategName1All();
        return res;
    }


    @RequestMapping(value = "catname2")
    @ResponseBody
    public List<String> catName2(@RequestParam(value = "catName2") String catName2) {

        List<String> res = productService.getCategoriesName2(catName2);
        for (String s  : res ) {
            System.out.println(s);
        }
        return res;
    }



}
