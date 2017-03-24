package com.example.envers.controller;

import com.example.envers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@ResponseBody
public class UserListController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/users/history/{id}")
    public ResponseEntity<?> test(@PathVariable String id) {
        return ResponseEntity.ok(userRepository.findLastChangeRevision(id));
    }
}
