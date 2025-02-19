package org.example.springboot_14.repo;

import org.example.springboot_14.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceorderRepo extends JpaRepository<Orders, Long> {
}
