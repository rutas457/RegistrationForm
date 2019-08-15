package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.dto.UserDTO;
import com.training.RegistrationForm.dto.UsersDTO;
import com.training.RegistrationForm.entity.User;
import com.training.RegistrationForm.service.LoginFormService;
import com.training.RegistrationForm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class LoginFormController {

    private LoginFormService loginFormService;

    @Autowired
    private UserService userService;
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

        return "redirect:/result";
    }

    @RequestMapping(value="/result", method=RequestMethod.GET)
    public String getLoginResultPage(Model model) {
        ArrayList<User> users = new ArrayList<User>(userService.getAllUsers().getUsers());
        model.addAttribute("users", users);
        return "all";
    }


}
