package org.example.springboot_14.service;

import org.example.springboot_14.dto.CustomerDTO;
import org.example.springboot_14.entity.Customer;
import org.example.springboot_14.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;

    public boolean addCustomer(CustomerDTO customerDTO){
//        Customer customer =  new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress());
        Customer customer = modelMapper.map(customerDTO,Customer.class);
        customerRepo.save(customer);
        return true;
    }

    public List<CustomerDTO> getAllCustomer() {
//        List<Customer> customers = customerRepo.findAll();
//        return customers.stream().map(customer -> new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress())).toList();
        return modelMapper.map(customerRepo.findAll(),new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO,Customer.class);
        customerRepo.save(customer);
    }

    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return "Deleted";
    }

    public List<String> getAllCustomerIDS() {
        return customerRepo.findAllCIDS();
    }

    public CustomerDTO getCustomerData(String id) {
        return modelMapper.map(customerRepo.getCustomerData(id),CustomerDTO.class);

    }
}
