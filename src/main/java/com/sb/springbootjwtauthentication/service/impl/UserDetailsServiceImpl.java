package com.sb.springbootjwtauthentication.service.impl;

import com.sb.springbootjwtauthentication.model.entity.User;
import com.sb.springbootjwtauthentication.model.factory.JwtUserFactory;
import com.sb.springbootjwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException("The username " + username + " doesn't exist.");
        }
        
        return JwtUserFactory.create(user);
    }
}