package com.example.contactbs.controller;

import com.example.contactbs.pojo.Contacts;
import com.example.contactbs.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ContactController {

    @Autowired
    private ContactsService service;
    @GetMapping("/contacts/show")
    public List<Contacts> viewContacts() {
        return service.list();
    }

    @PostMapping("/contacts/save")
    public void addContact(@RequestBody Contacts contact) {
        service.save(contact);
    }

    @PutMapping("/contacts/update/{id}")
    public void updateContact( @RequestBody Contacts updatedContact) {
        service.updateById(updatedContact);
    }

    @DeleteMapping("/contacts/delete/{id}")
    public void deleteContact(@PathVariable int id) {
        service.removeById(id);
    }
}
