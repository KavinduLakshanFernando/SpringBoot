package org.example.springboot_13.service;

import org.example.springboot_13.dto.CustomerDTO;
import org.example.springboot_13.entity.Customer;
import org.example.springboot_13.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDTO customerDTO){
        Customer customer =  new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress());
        customerRepo.save(customer);
        return true;
    }

    public List<CustomerDTO> getAllCustomer() {
        List<Customer> customers = customerRepo.findAll();
        return customers.stream().map(customer -> new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress())).toList();
    }

    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress());
        customerRepo.save(customer);
    }

    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return "Deleted";
    }
}
