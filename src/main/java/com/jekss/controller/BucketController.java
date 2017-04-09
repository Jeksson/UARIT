package com.jekss.controller;

import com.jekss.entityes.Bucket;
import com.jekss.service.BucketService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Created by jekss on 13.01.17.
 */
@Controller
@RequestMapping("/bucket")
public class BucketController {

    private Bucket bucket;

    @Resource
    private BucketService bucketService;

    private Map <Integer, Integer> mapTovar;



    @RequestMapping(value = "/{idProduct}/{count}", method = RequestMethod.GET)
    @ResponseBody
    public Set<String> addProductInBucket(HttpServletRequest request, @PathVariable int idProduct, @PathVariable int count) {

        Map <Integer, Integer> prodList = new HashMap<>();
        prodList.put(idProduct, count);//ключ - id товара; значение - количество товара

        Bucket bucket = bucketService.editMapProductInBucket(request.getSession().getId(), prodList);

        Set<String> result = new HashSet<>();

        return result;
    }



    @RequestMapping(value = "/{idProduct}", method = RequestMethod.DELETE)
    @ResponseBody
    public Set<String> removeProductInBucket(@PathVariable int idProduct) {
        Set<String> result = new HashSet<>();








        return result;
    }



    @RequestMapping(value = "/{idProduct}/{count}", method = RequestMethod.PUT)
    @ResponseBody
    public Set<String> editProductInBucket(@PathVariable int idProduct, @PathVariable int count) {
        System.out.println(idProduct + " " + count);
        Set<String> result = new HashSet<>();








        return result;
    }



    @RequestMapping(method = RequestMethod.GET)
    public String getPageOrderInfo() {

        Set<String> result = new HashSet<>();

        return "order_info";
    }
}
