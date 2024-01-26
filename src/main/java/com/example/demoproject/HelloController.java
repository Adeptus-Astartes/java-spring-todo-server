package com.example.demoproject;

import com.example.demoproject.dto.ApiConstant;
import com.example.demoproject.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(ApiConstant.USER + "/v1")
    @ResponseBody
    public UserDto getExample() {
        return new UserDto(30,"John Doe");
    }
}