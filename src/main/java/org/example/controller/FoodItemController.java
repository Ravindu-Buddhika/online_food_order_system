package org.example.controller;

import org.example.model.dto.FoodItemDTO;
import org.example.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    public void addFoodItem(@RequestBody FoodItemDTO foodItemDTO){
                foodItemService.addFoodItem(foodItemDTO);
    }
}
