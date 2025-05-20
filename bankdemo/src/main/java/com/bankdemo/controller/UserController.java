package com.bankdemo.controller;

import com.bankdemo.model.User;
import com.bankdemo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    /*@PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid LoginRequest dto) {
        return ResponseEntity.ok(userService.login(dto));
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}

