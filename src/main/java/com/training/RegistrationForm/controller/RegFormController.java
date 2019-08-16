package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.dto.UserDTO;
import com.training.RegistrationForm.entity.Role;
import com.training.RegistrationForm.entity.User;
import com.training.RegistrationForm.repository.UserRepository;
import com.training.RegistrationForm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
        model.addAttribute("user", new User());
        LoginFormController.message = "";
        return "reg_form";
    }

    @PostMapping(path = "/reg")
    public String user(@Valid User userForm, BindingResult result, Model model) {

        if (!userService.isValid(userForm)) {
            return "reg_form";
        }
        User newUser = User.builder()
                .fullName(userForm.getFullName())
                .email(userForm.getEmail())
                .password(userForm.getPassword())
                .role(Role.USER)
                .build();

        userService.saveNewUser(newUser);
        model.addAttribute("user", newUser);
        return "redirect:/";
    }

}
