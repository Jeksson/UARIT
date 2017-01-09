package com.jekss.controller;


import com.jekss.service.*;
import com.jekss.util.LogicProduct.NewProduct;
import com.jekss.util.LogicProduct.RandomBrandProduct;
import com.jekss.util.LogicProduct.RandomProduct;
import com.jekss.util.LogicProduct.RecomendedProd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by jekss on 17.07.16.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    private Map<String, List<String>> cat2Map = new HashMap<>();


    @Resource
    private ProductService productService;

    @Resource
    private RecomendedProd recomemdedProd;

    @Resource
    private NewProduct newProduct;

    @Resource
    private RandomProduct randomProduct;

    @Resource
    private RandomBrandProduct randomBrandProduct;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {


        for (String s : productService.getCategName1All()) {
            cat2Map.put(s, productService.getCategoriesName2(s));
        }

        model.addAttribute("recomendedProd", recomemdedProd.recomemdedProd());
        model.addAttribute("newProd", newProduct.newProd());
        model.addAttribute("randomProd", randomProduct.randomProd());
        model.addAttribute("randomBrand", randomBrandProduct.randomBrand());



        model.addAttribute("listCateg1", productService.getCategName1All());
        model.addAttribute("mapCateg2", cat2Map);

        return "home_v1";
    }
}
