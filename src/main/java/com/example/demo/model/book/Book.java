package com.example.demo.model.book;

import java.util.List;

import com.example.demo.model.order.Buy;
import com.example.demo.model.order.Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

    private String publisher;

    private String publishedDate;

    private String description;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ImageLink> imageLinks;

    private String category;

    private Integer price;

    private Integer stock;

    @ManyToMany(mappedBy = "books")
    private List<Order> orders;

    @OneToMany(mappedBy = "book")
    private List<Buy> buys;
}
