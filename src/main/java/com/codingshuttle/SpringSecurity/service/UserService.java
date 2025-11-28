package com.codingshuttle.SpringSecurity.service;

import com.codingshuttle.SpringSecurity.exception.ResourceNotFoundException;
import com.codingshuttle.SpringSecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findByEmail(username).orElseThrow(()->new ResourceNotFoundException("user with email "+username+" not found"));
    }
}
