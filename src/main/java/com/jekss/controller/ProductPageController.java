package com.jekss.controller;

import com.jekss.entityes.Product;
import com.jekss.service.ProductService;
import com.jekss.util.LogicProduct.NewProduct;
import com.jekss.util.LogicProduct.RandomBrandProduct;
import com.jekss.util.LogicProduct.RandomProduct;
import com.jekss.util.LogicProduct.RecomendedProd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jekss on 10.01.17.
 */
@Controller
@RequestMapping("/productpage")
public class ProductPageController {

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

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String helloMethod(@PathVariable int id, Model model) {
        Product product = productService.getByIdProduct(id);

        model.addAttribute("prodId", product.getId());
        model.addAttribute("prodName", product.getName());
        model.addAttribute("prodPicture", product.getPicture());
        model.addAttribute("prodManuf", product.getManufactures());
        model.addAttribute("prodPrice", product.getPrice());
        model.addAttribute("prodCat1",product.getCategoriesName1());
        model.addAttribute("prodCat2",product.getCategoriesName2());



        for (String s : productService.getCategName1All()) {
            cat2Map.put(s, productService.getCategoriesName2(s));
        }

        model.addAttribute("recomendedProd", recomemdedProd.recomemdedProd());
        model.addAttribute("newProd", newProduct.newProd());
        model.addAttribute("randomProd", randomProduct.randomProd());
        model.addAttribute("randomBrand", randomBrandProduct.randomBrand());



        model.addAttribute("listCateg1", productService.getCategName1All());
        model.addAttribute("mapCateg2", cat2Map);


        return "products_page_v1";


    }

}
