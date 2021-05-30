package sheridan.gahirl.exercise1v1.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller

public class Controller {


    @GetMapping("/Input")
    public String input() {


        return "Input";
    }

    @GetMapping("/Output")
    public String output(@RequestParam String name,
                         Model model) {


        model.addAttribute("name", name);
        return "Output";
    }
}


