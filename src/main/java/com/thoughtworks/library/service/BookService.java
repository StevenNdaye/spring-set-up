package com.thoughtworks.library.service;

import com.thoughtworks.library.entity.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public List<Book> getBooks();
    public Book getBookByIsbn(String isbn);
    public void removeBook(String isbn);
}
