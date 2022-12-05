package com.example.libraryapp_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to Library Homepage";
    }


    @PostMapping("/search")
    public String Searchbooks()
    {
        return "Books search page";
    }

    @PostMapping("/entry")
    public String Enterbooks()
    {
        return "Books entry page";
    }

    @PostMapping("/edit")
    public String Editbooks()
    {
        return "Books edit page";
    }



}
