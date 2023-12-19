package com.example.demo.user;

import java.util.List;

import com.example.demo.order.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    private String password;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String role;

    private String balance;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
