package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.dto.UserDTO;
import com.training.RegistrationForm.dto.UsersDTO;
import com.training.RegistrationForm.entity.Role;
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
    public static String message = "";

    @Autowired
    private UserService userService;

    @Autowired
    public LoginFormController(LoginFormService loginFormService) {
        this.loginFormService = loginFormService;
    }

    @GetMapping(value = "/")
    public String getLoginPage(Model model) {
        model.addAttribute("msg", message);
        return "login_form";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String userSubmit(Model model,@RequestParam(value = "login") String login, @RequestParam(value = "password") String password) {
        User user = userService.findByUserEmail(new UserDTO(login, password));
        model.addAttribute("user", user);
        if (!(user == null)) {
            if (user.getPassword().equals(password)) {
                if(user.getRole().equals(Role.ADMIN))
                return "redirect:/admin";
                else return "result";
            } else {
                message = "The password is incorrect";
                return "redirect:/";
            }
        }
        message = "There is no such user";
        return "redirect:/";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getLoginResultPageAdmin(Model model) {
        ArrayList<User> users = new ArrayList<User>(userService.getAllUsers().getUsers());
        model.addAttribute("users", users);
        return "all";
    }


}
