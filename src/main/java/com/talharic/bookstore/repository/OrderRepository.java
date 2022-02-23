package com.talharic.bookstore.repository;

import com.talharic.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
