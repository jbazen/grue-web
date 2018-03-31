package com.jahaba.grue.grueweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GrueWebController {

    @GetMapping("/grue")
    public String grue(@RequestParam(name="name", required=false, defaultValue="Grue") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
