package com.thoughtworks.library.dao.impl;

import com.thoughtworks.library.dao.BookDAO;
import com.thoughtworks.library.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @Override
    public void updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Book> getBooks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book").list();
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        Session session = sessionFactory.getCurrentSession();
        return session.load(Book.class, isbn);
    }

    @Override
    public void removeBook(String isbn) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.load(Book.class, isbn);
        if (book != null) {
            session.delete(book);
        }
    }
}
