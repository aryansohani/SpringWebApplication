package com.aryan.springmodelandview;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controling {


    @RequestMapping("alien")
    public ModelAndView addalien(ModelAndView mv, @RequestParam("name")String name ,@RequestParam("id")int id)
    {
        Alien alien = new Alien();
        alien.setName(name);
        alien.setId(id);
        mv.addObject(alien);
        mv.setViewName("alienhome");
        return mv;
    }
}
