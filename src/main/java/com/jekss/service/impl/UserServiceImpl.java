package com.jekss.service.impl;

import com.jekss.entityes.User;
import com.jekss.repository.UserRepository;
import com.jekss.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * Created by jekss on 16.10.16.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    @Resource
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        User user1 = userRepository.saveAndFlush(user);
        return user1;
    }

    @Override
    public void deleteProduct(int id_user) {
        userRepository.delete(id_user);
    }

    @Override
    public User getByNameUser(String name_user) {
        return userRepository.findByName(name_user);
    }

    @Override
    public User getByLoginUser(String login_user) {
        return userRepository.findByLogin(login_user);
    }

    @Override
    public User getByEmailUser(String email_user) {
        return userRepository.findByEmail(email_user);
    }

    @Override
    public User editUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
