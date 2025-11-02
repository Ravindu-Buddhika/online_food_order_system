package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FoodItemEntity {
    @Id
    private String id;
    private String name;
    private double price;
    private int qty;
}
