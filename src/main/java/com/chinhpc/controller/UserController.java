package com.chinhpc.controller;

import com.chinhpc.model.entity.User;
import com.chinhpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-portal/api/users")
public class UserController {
    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAll(@RequestParam(name = "q", required = false)
                                                          String keyword) {
        Iterable<User> users;
        if (keyword == null) {
            users = userService.findAll();
        } else {
            users = userService.find
        }
    }

}
