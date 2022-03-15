package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contacts/")
    public String getContacts(){
        return "HEEEEY YA GET";
    }
    
    @PostMapping("/contacts/")
    public Contact postContacts(@RequestBody Contact contact){
        return contact;
    }
}
