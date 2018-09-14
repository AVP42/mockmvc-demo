package com.example.mockmvcdemo;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: mockController
 * @Description: mock测试类
 * @Info: createdBy alien on 2018/9/14/014 13:49
 */
@RestController
public class MockController {
    @RequestMapping(value = "mockTest",method = RequestMethod.GET)
    public User mockTest(String useranme) {
        User user = new User();
        user.setName("alien");
        return user;
    }

    @Data
    static class User{
        private String name;
    }
}
