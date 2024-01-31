package com.tammy.backendboilerplate.controller;

import com.tammy.backendboilerplate.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    private String jwtToken = "asdhjklloiuuyy5677889";

    @PostMapping("/register")
    public UserDTO register (@RequestBody UserDTO userDTO){
        userDTO.setToken(jwtToken);
        return userDTO;
    }

    @PostMapping("/login")
    public UserDTO login (@RequestBody UserDTO userDTO){
        userDTO.setToken(jwtToken);
        return userDTO;
    }
}
