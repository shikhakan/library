package com.example.library.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
// Controller is your entry point
public class StudentController {

    // GET, POST, PUT, DELETE

    @GetMapping("/hello")
    public String helloPrinter() {
        // camel case -> camelCase -> naming in Java
        // snake case -> snake_case -> json for interacting with the outside world
        return "Hello Ayush this is your first API";
    }

    @GetMapping("/user")
    public String helloUser(@RequestParam("user_name") String userName, @RequestParam("input_1") Integer input1) {

        String response = "Hi " + userName + " you are welcome to our second API";
        return response;

    }


}
