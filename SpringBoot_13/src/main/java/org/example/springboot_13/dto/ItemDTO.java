package org.example.springboot_13.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class ItemDTO {
    private String iid;
    private String description;
    private Double u_Price;
    private int qty;
}
