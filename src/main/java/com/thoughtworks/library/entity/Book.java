package com.thoughtworks.library.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String isbn;
    private String description;
    private BigDecimal price;

    public Book(String title, String isbn, String description, BigDecimal price) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.price = price;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
