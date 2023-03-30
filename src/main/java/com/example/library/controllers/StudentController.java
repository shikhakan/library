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

    // website -> www.library.com
    // controller -> www.library.com/student
    // API -> www.library.com/student/hello

    @GetMapping("/hello")
    public String helloPrinter() {
        // camel case -> camelCase -> naming in Java
        // snake case -> snake_case -> json for interacting with the outside world
        return "Hello Shikha this is your first API";
    }

    // TODO Write API like the above for printing Hi

    @GetMapping("/hello-user")
    public String helloUser(@RequestParam("user_name") String userName) {

        String response = "Hi " + userName + " you are welcome to our second API";
        return response;

    }

    // TODO Write API to take the name of 3 friends and print Hi <friend name>, <friend name>, <friend name>

    @GetMapping("/69-adder")
    public int calculator(@RequestParam Integer num1) {
        return num1 + 69;
    }

    // TODO Input 2 numbers and return their sum

    // TODO Input 4 numbers and return their sum

}
