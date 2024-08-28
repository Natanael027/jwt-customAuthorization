package com.tericcabrel.authapi.controllers;

import com.tericcabrel.authapi.entities.User;
import com.tericcabrel.authapi.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequestMapping("/path1")
@RestController
public class Path1Controller {
    @GetMapping("/test")
    public ResponseEntity<String> authenticatedUser(Authentication authentication) {
        // Cast principal to UserDetails
        Object principal = authentication.getPrincipal();
        if (principal instanceof User) {
            User currentUser = (User) principal;

            // Debug information
            System.out.println("Current User: " + currentUser);
            System.out.println("Username: " + currentUser.getUsername());
            System.out.println("Authorities: " + authentication.getAuthorities());
            System.out.println("Credentials: " + authentication.getCredentials());
            System.out.println("Authentication Details: " + authentication.getDetails());
        } else {
            System.out.println("Principal is not of type User");
        }


        return ResponseEntity.ok("Hello from path1");
    }

}
