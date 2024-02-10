//package com.Vaccination.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import com.Vaccination.entity.*;
//import com.Vaccination.repo.UserRepo;
//
//
//@Service
//public class UserServicesImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepo ur;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = ur.findByUsername(username);
//        if (user == null) {
//        	throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//
//        return org.springframework.security.core.userdetails.User
//                .withUsername(username)
//                .password(user.getPassword())
//                .roles(user.getRoles())
//                .build();
//    
//
//        }
//    }
//
