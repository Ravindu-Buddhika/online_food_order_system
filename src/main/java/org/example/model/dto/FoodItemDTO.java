package org.example.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItemDTO {
    private String id;
    private String name;
    private double price;
    private int qty;
}
