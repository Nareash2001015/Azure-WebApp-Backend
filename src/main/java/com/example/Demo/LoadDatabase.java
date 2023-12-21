package com.example.Demo;

import com.example.Demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.Demo.entity.User;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository){
        return args -> {
            log.info("Preloading " + userRepository.save(new User("Nareash", "vnareashkaan@gmail.com")));
            log.info("Preloading " + userRepository.save(new User("Dhatchaya", "dhatchaya2000@gmail.com")));
        };
    }
}
