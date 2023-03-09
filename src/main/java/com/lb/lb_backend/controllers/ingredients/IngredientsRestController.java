package com.lb.lb_backend.controllers.ingredients;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsRestController {

    @GetMapping("/{ingredient}")
    public String getIngredients(@PathVariable String ingredient) {
        return "Received call to GET with " + ingredient;
    }

    @PostMapping("/{ingredient}")
    public String postIngredients(@PathVariable String ingredient) {
        return "Received call to POST with " + ingredient;
    }
}
