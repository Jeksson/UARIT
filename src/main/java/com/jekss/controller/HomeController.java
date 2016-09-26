package com.jekss.controller;

import com.jekss.service.*;
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







    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String helloMethod(Model model) {

        return "home_v1";
    }








}
