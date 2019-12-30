package com.controller;

import com.entity.Pets;
import com.service.PetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PetsController {
    @Resource
    private PetsService petsService;
    @RequestMapping("findPets")
    public String findPets(Model model){
        List<Pets> pets = petsService.findPets();
        model.addAttribute("Pets",pets);
        return "index.jsp";
    }
}
