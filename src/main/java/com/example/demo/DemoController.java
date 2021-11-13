package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    
    @GetMapping("/se")
    public ModelAndView showGreeting() {
        ModelAndView mv = new ModelAndView("controller");
        mv.addObject("name", "Hello SE352/452 from test");
        return mv;
    }
}
