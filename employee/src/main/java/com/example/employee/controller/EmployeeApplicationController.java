package com.example.employee.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeApplicationController {
    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @PostMapping("/result")
    public String results(String id,String fname,String lname, String bu,String mail , Model model) {
        model.addAttribute("id", id);
        model.addAttribute("fname", fname);
        model.addAttribute("lname",lname );
        model.addAttribute("bu", bu);
        model.addAttribute("mail", mail);
        return "result";
    }

}
