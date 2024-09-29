package geekbrains.springBoot3home.controllers;

import geekbrains.springBoot3home.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public Greeting greet() {
        return new Greeting("Hello, world!");
    }
}
