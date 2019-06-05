package com.yakovlev.springbootproject.repositories;

import com.yakovlev.springbootproject.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
