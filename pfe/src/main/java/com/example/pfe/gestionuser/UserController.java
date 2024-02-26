package com.example.pfe.gestionuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final userService userService;
    @Autowired
    public UserController(userService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<user> getUser() {
        return userService.getUser();
    }
    @PostMapping()
    public void newUser(@RequestBody user u) {


        userService.addUser(u);
    }
    @DeleteMapping(path = "{ProdId}")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{ProdId}")
    public ResponseEntity<user> getUser(@PathVariable("userId") Long id) {
        user user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }




    }
}










