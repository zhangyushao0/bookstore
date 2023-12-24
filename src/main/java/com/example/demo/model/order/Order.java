package com.example.demo.model.order;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.book.Book;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Integer total;

    private LocalDateTime startTime;

    private LocalDateTime finishTime;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "order_table_book", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
            @JoinColumn(name = "book_id") })
    private List<Book> books;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order")
    private List<Buy> buys;

}
