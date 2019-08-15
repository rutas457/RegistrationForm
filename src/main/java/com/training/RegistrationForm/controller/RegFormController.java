package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.entity.Role;
import com.training.RegistrationForm.entity.User;
import com.training.RegistrationForm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class RegFormController {

    private final UserService userService;

    @Autowired
    public RegFormController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/reg")
    public String getRegistrationPage(Model model) {
        return "reg_form";
    }

    @PostMapping(path = "/reg")
    public String user(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password,
                       @RequestParam(value = "email") String email) {


        userService.saveNewUser(User.builder()
                .fullName(name)
                .email(email)
                .password(password)
                .role(Role.USER)
                .build());
        return "redirect:/";
    }

}
