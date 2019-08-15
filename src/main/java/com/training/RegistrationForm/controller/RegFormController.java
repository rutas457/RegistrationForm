package com.training.RegistrationForm.controller;

import com.training.RegistrationForm.entity.UserDB;
import com.training.RegistrationForm.service.RegFormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class RegFormController {

    private RegFormService regFormService;

    @Autowired
    public RegFormController(RegFormService regFormService) {
        this.regFormService = regFormService;
    }

    @GetMapping(value="/reg")
    public String getRegistrationPage(Model model) {
        return "reg_form";
    }

    @RequestMapping(value="/reg", method=RequestMethod.POST)
    public String user(@RequestParam(value="name") String name, @RequestParam(value="password") String password,
                       @RequestParam(value="email") String email) {
        UserDB.user.setLogin(name);
        UserDB.user.setPassword(password);
        UserDB.user.setPassword(email);
        String info = UserDB.user.getLogin() + " " + UserDB.user.getPassword();
        log.info(info);

        return "redirect:/";
    }

}
