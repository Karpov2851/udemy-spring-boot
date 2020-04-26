package com.boot.udemy.controllers;

import com.boot.udemy.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by vikas on 26-04-2020.
 */
@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping(value="/get-books")
    public String getBooks(Model m){
        m.addAttribute("books",bookRepository.findAll());
        return "list";
    }
}
