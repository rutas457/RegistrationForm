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
}
