package org.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "안녕하세요2";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "안녕하세요3";
    }
}
