package org.example.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderEentity {
    private String orderID;

    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerEntity customerEntity;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private FoodItemEntity foodItemEntity;
}
