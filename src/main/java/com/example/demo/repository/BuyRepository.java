package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.order.Buy;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {
}
