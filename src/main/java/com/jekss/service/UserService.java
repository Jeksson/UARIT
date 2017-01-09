package com.jekss.service;

import com.jekss.entityes.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by jekss on 16.10.16.
 */
public interface UserService {

    User addUser(User user);
    void deleteProduct(int id_user);
    User getByNameUser(String name_user);
    User getByLoginUser(String login_user);
    User getByEmailUser(String email_user);
    User editUser(User user);
    List<User> getAll();


}
