package com.bookstoreLucas.bookstore.controllers;

import com.bookstoreLucas.bookstore.model.Book;
import com.bookstoreLucas.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    private List<Book> listarLivros(){
        return bookRepository.findAll();
    }

}
