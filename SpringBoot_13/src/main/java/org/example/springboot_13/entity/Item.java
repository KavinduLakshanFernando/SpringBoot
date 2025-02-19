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
public class Item {
    @Id
    public String iid;
    public String description;
    public Double u_Price;
    public int qty;
}
