package com.example.spisok.service;

import com.example.spisok.entity.Role;
import com.example.spisok.entity.Users;
import com.example.spisok.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Users users =userRepository.findFirstByEmail(username);

        if (users == null){
            throw new UsernameNotFoundException("User not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<Role> roles = users.getRoles();
        for (Role r:roles){
            authorities.add(new SimpleGrantedAuthority(r.getRole()));
        }
        return new User(users.getEmail(), users.getPassword(),authorities);
    }

    public void save(Users user) {
        this.userRepository.save(user);
    }
}
