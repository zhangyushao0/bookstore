package com.example.demo.model.book;

import java.util.List;

import com.example.demo.model.order.Buy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String author;

    private String isbn;

    private String description;

    private String imageLink;

    private String category;

    private Double price;

    private Integer stock;

    @OneToMany(mappedBy = "book")
    private List<Buy> buys;

    public Book(String title, String author, String isbn, String description, String imageLink, String category,
            Double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.description = description;
        this.imageLink = imageLink;
        this.category = category;
        this.price = price;
    }
}
