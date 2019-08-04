package com.jod.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jod
 * @date 2019/8/5-0:08
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi(){
        return "hello,github...";
    }
}
