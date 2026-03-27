package com.aryan.springmodelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controling {

    @RequestMapping("/alien")
    public String addalien(@ModelAttribute Alien alien) {
        return "alienhome";
    }

    @ModelAttribute("course")
    public String course() {
        return "Java";
    }
}
