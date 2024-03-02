package com.example.eventmanagement.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("https://localhost:3000")
public class UserController {
    private UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/newuser")
    public User newMessage(@RequestBody User newUser) {
        System.out.println("Received new user request: " + newUser.toString());

        try {
            User savedUser = userRepository.save(newUser);
            System.out.println("Saved user: " + savedUser.toString());
            return savedUser;
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            e.printStackTrace();
            throw e; // Rethrow the exception or handle it appropriately
        }
    }


    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User loginUser) {
        User user = userRepository.findByEmail(loginUser.getEmail());

        if (user == null || !user.getPassword().equals(loginUser.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }

        return ResponseEntity.ok(user);
    }
}
