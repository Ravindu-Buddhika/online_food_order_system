package org.example.service;

import org.example.model.dto.FoodItemDTO;
import org.example.model.entity.FoodItemEntity;
import org.example.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public void addFoodItem(FoodItemDTO foodItemDTO){
        foodItemRepository.save(
                new FoodItemEntity(
                        foodItemDTO.getId(),
                        foodItemDTO.getName(),
                        foodItemDTO.getPrice(),
                        foodItemDTO.getQty()
                )
        );
    }
}
