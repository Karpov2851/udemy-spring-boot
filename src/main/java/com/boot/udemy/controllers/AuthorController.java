package com.boot.udemy.controllers;

import com.boot.udemy.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by vikas on 26-04-2020.
 */
@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping(value="/get-authors")
    public String getBooks(Model m){
        m.addAttribute("authors",authorRepository.findAll());
        return "author_list";
    }
}
