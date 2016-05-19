package com.thoughtworks.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class LibraryController {


    @RequestMapping(method = RequestMethod.GET)
    public String welcome(ModelMap modelMap) {
        modelMap.addAttribute("greeting", "Welcome to our world");
        return "welcome";
    }
}
