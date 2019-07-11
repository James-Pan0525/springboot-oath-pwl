package com.pwl.oath.controller;

import com.pwl.oath.common.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pan Weilong
 * @date 2019/7/10 23:10
 * @description: 退出登录接口
 */
@RestController
public class LoginoutController {

    @Autowired
    @Qualifier("consumerTokenServices")
    private ConsumerTokenServices consumerTokenServices;

    /**
     * @Description 退出登录，清空redis中的token
     * @Date 10:44 2019/7/11
     **/
    @PostMapping("/removeToken")
    public ResultVO<Boolean> removeToken(String token){
        return new ResultVO(consumerTokenServices.revokeToken(token));
    }
}
