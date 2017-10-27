//package com.mygaienko.service;
//
//import com.mygaienko.dao.UserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DefaultUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserDao userDao;
//
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        return userDao.getByEmail(email);
//    }
//}
