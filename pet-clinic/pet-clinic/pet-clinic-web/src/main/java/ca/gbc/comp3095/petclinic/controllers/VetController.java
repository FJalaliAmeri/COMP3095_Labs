package ca.gbc.comp3095.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/", "/vets/index.html", "/vets/index"})
    public String listVets(){
        return "vets/index";
    }
}
