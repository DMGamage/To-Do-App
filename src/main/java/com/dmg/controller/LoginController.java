package com.dmg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
    //login
    @RequestMapping("/login")
    public String gotoLoginPage() {
        return "login";
    }
}
