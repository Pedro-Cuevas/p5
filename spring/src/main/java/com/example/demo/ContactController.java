package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private java.util.ArrayList<Contact> contactList = new java.util.ArrayList<Contact>();

    @GetMapping("/contacto")
    public Contact getLastContact(){
        return contactList.get(contactList.size()-1);
    }
    
    @PostMapping("/contacto")
    public Contact postContacts(@RequestBody Contact contact){
        contactList.add(contact);
        return contactList.get(contactList.size()-1);
    }
}