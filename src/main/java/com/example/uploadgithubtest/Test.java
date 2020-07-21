package com.example.uploadgithubtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kxhan
 * @createTime 2020/07/21
 */

@RestController
public class Test {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
