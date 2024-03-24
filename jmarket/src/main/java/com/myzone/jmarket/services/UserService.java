package com.myzone.jmarket.services;

import com.myzone.jmarket.models.User;
import com.myzone.jmarket.models.enums.Role;
import com.myzone.jmarket.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser (User user){
        if(userRepository.findByEmail(user.getEmail()) != null)
            return false;
        String email = user.getEmail();
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_USER);
        log.info("Saving new User with email: {}", email);
        userRepository.save(user);
        return true;
    }
}
