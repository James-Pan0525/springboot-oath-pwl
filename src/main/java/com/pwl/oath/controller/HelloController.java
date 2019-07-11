package com.pwl.oath.controller;


import com.pwl.oath.common.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pan Weilong
 * @date 2019/6/20 15:06
 * @description: 接口.
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public ResultVO hello(){
        return new ResultVO("1");
    }


}
