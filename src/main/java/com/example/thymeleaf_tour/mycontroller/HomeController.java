package com.example.thymeleaf_tour.mycontroller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@Controller
public class HomeController {
        @GetMapping("/showFlowerList")
        public String sendDataToHtml(Model model) {
            String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };

            String[] City = new String[] { "nyc", "nj", "dallas", "chicago", "philadelphia" };
            model.addAttribute("flowersVariable", flowers);
            model.addAttribute("CityVariable", City);
            return "viewFlowers";
        }
    }

