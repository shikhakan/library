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
    @GetMapping("/print-hi")
    public String printingHi() {
        return "hi Guys, How are you?";
    }


    @GetMapping("/hello-user")
    public String helloUser(@RequestParam("user_name") String userName) {

        String response = "Hi " + userName + " you are welcome to our second API";
        return response;

    }

    // TODO Write API to take the name of 3 friends and print Hi <friend name>, <friend name>, <friend name>
    @GetMapping("/friends-forever")
    public String friendsForever(@RequestParam("friend_name1") String friendName1, @RequestParam("friend_name2") String friendName2, @RequestParam("friend_name3") String friendName3) {

        String introduction = "Hi" + friendName1 + friendName2 + friendName3 + "Hello Fraands";
        return introduction;
    }


    @GetMapping("/69-adder")
    public int calculator(@RequestParam Integer num1) {
        return num1 + 69;
    }

    // TODO Input 2 numbers and return their sum

    @GetMapping("/add-2-numbers")
    public int add(@RequestParam Integer num1, @RequestParam Integer num2) {
        int sum = num1 + num2;
        return sum;

    }

    // TODO Input 4 numbers and return their sum
    @GetMapping("/add-4-numbers")
    public int addition(@RequestParam Integer num1, @RequestParam Integer
            num2, @RequestParam Integer num3, @RequestParam Integer num4) {
        int sum = num1 + num2 + num3 + num4;
        return sum;

    }
}
