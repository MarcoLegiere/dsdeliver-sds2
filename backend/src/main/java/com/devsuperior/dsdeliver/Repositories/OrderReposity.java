package com.devsuperior.dsdeliver.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderReposity extends JpaRepository<Order, Long> {

}
