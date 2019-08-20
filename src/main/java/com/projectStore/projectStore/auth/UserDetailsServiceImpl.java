package com.projectStore.projectStore.auth;

import com.projectStore.projectStore.dao.UserDao;
import com.projectStore.projectStore.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final Logger log = LogManager.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUserName(username);

      if(user == null) {
            throw new UsernameNotFoundException(username);
        }

        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority("USER"));

        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getUserLogin(),
                        user.getUserPass(),
                        roles);

        return userDetails;
    }
}