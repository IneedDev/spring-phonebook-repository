package com.example.phonebook.controller.model;

import com.example.phonebook.model.ContactForm;
import com.example.phonebook.model.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PhoneController {

    @Autowired
    ContactService contactService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

//    @GetMapping("/contactlist")
//    public String contactlist(){
//        return "contactlist";
//    }

    @GetMapping("/addform")
    public String addform(Model model){
        model.addAttribute("contactForm",new ContactForm());
        return "addform";
    }

    @GetMapping("/contactlist")
    public String printContacts (Model model){
        model.addAttribute("contact_list",contactService.printAllPhoneContacts());
        return "contactlist";
    }

    @PostMapping("/addform")
    public String contactDetails(@ModelAttribute ContactForm contactForm, Model model){
        model.addAttribute("addContact",contactService.addPhoneContact(contactForm));
        return "addform";
    }


}
