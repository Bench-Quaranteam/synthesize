package com.daugherty.synthesize.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("drone")
public class Controller {

    @GetMapping("/{input}")
    public Object returnInput(@PathVariable("input") Object input) {
        return input;
    }

    @GetMapping("/getNumber")
    public int getNumber() {
        return 123;
    }

    @GetMapping("/getNegativeInteger")
    public int getNegativeInteger() {
        return -3;
    }

    public int getOne() {
        return 1;
    }
    public int getTwo() {
        return 2;
    }
    public int getThree() {
        return 3;
    }
    public int getFour() {
        return 4;
    }
}
