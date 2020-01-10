package com.jzc.algorithm_visualization.controller;

import com.jzc.algorithm_visualization.entity.TestData;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class TestDataController {

    @PostMapping("/getData")
    public String getData(@RequestBody TestData data){
        System.out.println(data.code);
        return "getData";
    }
}
