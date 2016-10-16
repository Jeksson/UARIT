package com.jekss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jekss on 16.10.16.
 */
@Controller
public class RegisterController {



    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String registerPage(){

        return "create_an_account";
    }
}
