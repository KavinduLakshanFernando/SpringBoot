package org.example.springboot_13.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

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
}
