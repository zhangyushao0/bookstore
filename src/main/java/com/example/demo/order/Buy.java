package com.example.demo.order;

import com.example.demo.book.Book;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Buy {

    @Id
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Book book;
}
