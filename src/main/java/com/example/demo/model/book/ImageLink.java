package com.example.demo.model.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ImageLink {

    @Id
    @GeneratedValue
    private Long id;

    private String thumbnailUrl;

    @ManyToOne
    private Book book;
}
