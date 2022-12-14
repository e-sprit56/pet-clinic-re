package com.whitetip.petclinicre.controllers;

import com.whitetip.petclinicre.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("")
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/list";
    }

    @GetMapping("/find")
    @ResponseBody
    public String findOwners(){
        return "Not implemented yet";
    }
}
