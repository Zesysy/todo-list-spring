package fr.wcs.sylene.yourtodolist.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.User;

import fr.wcs.sylene.yourtodolist.model.AppUser;
import fr.wcs.sylene.yourtodolist.repository.UserRepository;

@Service("userService")
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> maybeAppUser = userRepository.findByUsername(username);
        User u = maybeAppUser.map(user -> new User(user.getUsername(), user.getPassword(), Collections.emptyList()))
                .orElseThrow(() -> new UsernameNotFoundException(""));
        return u;
    }
}