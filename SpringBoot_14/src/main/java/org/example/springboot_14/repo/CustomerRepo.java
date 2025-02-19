package org.example.springboot_14.repo;

import org.example.springboot_14.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {

    @Query(value = "select id from customer",nativeQuery = true)
    List<String> findAllCIDS();

    @Query(value = "select name,address from customer where id = ?1",nativeQuery = true)
    List<Customer> getCustomerData(String id);
}
