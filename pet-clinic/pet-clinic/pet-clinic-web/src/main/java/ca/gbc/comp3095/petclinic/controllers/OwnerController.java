package ca.gbc.comp3095.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/owers")
public class OwnerController {
    @RequestMapping({"","index", "index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
