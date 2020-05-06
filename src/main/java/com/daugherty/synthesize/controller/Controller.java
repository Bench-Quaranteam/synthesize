package com.daugherty.synthesize.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("drone")
public class Controller {

    @GetMapping("/{input}")
    public Object returnInput(@PathVariable("input") Object input) {
        return input;
    }

    @GetMapping
    public int getNumber() {
        return 123;
    }

    @GetMapping
    public int getNegativeNumber() {
        return -3;
    }
}
