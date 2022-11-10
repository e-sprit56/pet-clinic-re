package com.whitetip.petclinicre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/oups")
    @ResponseBody
    public String oups(){
        return "Not implemented yet";
    }
}
