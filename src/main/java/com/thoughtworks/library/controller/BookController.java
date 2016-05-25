package com.thoughtworks.library.controller;

import com.thoughtworks.library.entity.Book;
import com.thoughtworks.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(ModelMap modelMap) {

        Book book = new Book("Book title", "ISBN", "Description", new BigDecimal(100));
        bookService.addBook(book);

        List<Book> books = bookService.getBooks();
        System.out.println(books.size());

        modelMap.addAttribute("greeting", "Welcome to our world");
        return "welcome";
    }
}
