package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.entity.UserDB;
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
        return "login_form";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String userSubmit(@RequestParam(value="login") String login, @RequestParam(value="password") String password) {
        UserDB.user.setLogin(login);
        UserDB.user.setPassword(password);
        String info = UserDB.user.getLogin() + " " + UserDB.user.getPassword();
        log.info(info);

        return "redirect:/result";
    }

    @RequestMapping(value="/result", method=RequestMethod.GET)
    public String getLoginResultPage(Model model) {
        model.addAttribute("login", UserDB.user.getLogin());
        model.addAttribute("password", UserDB.user.getPassword());
        return "result";
    }
}
