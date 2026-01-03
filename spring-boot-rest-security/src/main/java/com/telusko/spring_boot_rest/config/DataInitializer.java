package com.telusko.spring_boot_rest.config;

import com.telusko.spring_boot_rest.model.AppUser;
import com.telusko.spring_boot_rest.repo.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initUsers(AppUserRepository repo, PasswordEncoder encoder) {
        return args -> {
            // Seed a basic user if not present
            repo.findByUsername("navin").orElseGet(() -> {
                AppUser u = new AppUser("navin", encoder.encode("n@123"), "USER");
                return repo.save(u);
            });

            // Seed an admin user if not present
            repo.findByUsername("admin").orElseGet(() -> {
                AppUser u = new AppUser("admin", encoder.encode("admin@789"), "ADMIN");
                return repo.save(u);
            });
        };
    }
}
