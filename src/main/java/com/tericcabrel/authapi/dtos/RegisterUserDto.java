package com.tericcabrel.authapi.dtos;

import com.tericcabrel.authapi.entities.Role;
import lombok.Data;
import java.util.Set;

@Data
public class RegisterUserDto {
    private String email;
    private String password;
    private String fullName;
    private Set<String> roles;
}
