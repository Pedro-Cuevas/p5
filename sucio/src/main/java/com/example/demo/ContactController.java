package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private java.util.ArrayList<Contact> contactList = new ArrayList<Contact>();

    @GetMapping("/contacts/")
    public Contact getContacts(){
        return contactList.get(contactList.lastIndexOf(contactList));
    }
    
    @PostMapping("/contacts/")
    public Contact postContacts(@RequestBody Contact contact){
        contactList.add(contact);
        return contact;
    }
}
