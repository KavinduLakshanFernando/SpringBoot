package org.example.springboot_14.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Customer {

    @Id
    public String id;
    public String name;
    public String address;

    @OneToMany(mappedBy = "customer")
    public List<Orders> orderList;

    public Customer(String name,String address){
        this.name = name;
        this.address = address;
    }
}
