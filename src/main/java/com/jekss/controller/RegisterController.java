package com.jekss.controller;

import com.jekss.entityes.User;
import com.jekss.service.UserService;
import com.jekss.util.registration.HashPasswordUser;
import com.jekss.util.registration.UserRegistrValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by jekss on 16.10.16.
 */
@Controller
@RequestMapping(value = "/registr")
public class RegisterController {

    @Resource
    private UserService userService;

    @Resource
    private HashPasswordUser hpu;



    @RequestMapping(method = RequestMethod.GET)
    public String registerPage(){

        return "create_an_account";
    }

    @RequestMapping(value = "adduser", method = RequestMethod.POST)
    @ResponseBody
    public Set<String> newUserAdd(@RequestParam(value = "login") String login,
                                  @RequestParam(value = "name") String name,
                                  @RequestParam(value = "email") String email,
                                  @RequestParam(value = "password") String password) throws NoSuchAlgorithmException {
        System.out.println(login + name + email + password + "|-|-|-|-|");
        Set<String> result = new HashSet<>();

        User user = new User();
        user.setName(name);
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);
        System.out.println(user.toString());
        userService.addUser(user);
        result.add("/");
        return result;
    }

    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> getLoginValid(@RequestParam(value = "text") String login){
        Map<String, String> result = new HashMap<>();
        User user = userService.getByLoginUser(login);

        if (login.equals("")){
           result.put("err","Логин не должен быть пустым");
            return result;
        } else if(login.length() < 6){
            result.put("err", "Длина логина не должна быть меньше 6 символов");
            return result;
        } else if(login.length() > 15){
            result.put("err", "Длина логина не должна быть больше 15 символов");
            return result;
        } else if(user != null){
            if (user.getLogin().equals(login)){
                result.put("err","Такой логин уже существует");
                return result;
            }
        }else if (!UserRegistrValidator.loginValidation(login)){
            result.put("err","Не коректный логин");
            return result;
        } else {
            result.put("ok", "ok login");
            return result;
        }


        return result;
    }



    @RequestMapping(value = "email", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> getEmailValid(@RequestParam(value = "text") String email){

        Map<String, String> result = new HashMap<>();
        User user = userService.getByEmailUser(email);

        if (email.equals("")) {
            result.put("err","поле не должно быть пустым");
        } else if (!UserRegistrValidator.emailValidation(email)) {
            result.put("err","не корректный email");
        } else if (user != null) {
            if (user.getEmail().equals(email)) {
                result.put("err","такой email уже существует");
            }
        } else {
            result.put("ok","");
        }

        return result;
    }

}
