package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.entity.User;
import com.training.RegistrationForm.service.LoginFormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class LoginFormController {

    private LoginFormService loginFormService;

    @Autowired
    public LoginFormController(LoginFormService loginFormService) {
        this.loginFormService = loginFormService;
    }

    @GetMapping(value="/")
    public String getLoginPage(Model model) {
        return "reg_form";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String customerSubmit(@RequestParam(value="login") String login, @RequestParam(value="password") String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        String info = user.getLogin() + " " + user.getPassword();
        log.info(info);

        return "result";
    }
}
