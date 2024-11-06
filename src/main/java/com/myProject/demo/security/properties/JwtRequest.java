package com.myProject.demo.security.properties;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class JwtRequest {
    private String email;
    private String password;
}