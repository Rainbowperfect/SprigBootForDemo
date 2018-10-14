package com.person.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description com.person.controller2
 * @date 2017-8-17
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String sayHello(){
        return "hello,my name is steven.";
    }
}
