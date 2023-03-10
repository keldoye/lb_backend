package com.lb.lb_backend.controllers.ingredients;

import com.lb.lb_backend.data.mock.MockIngredients;
import com.lb.lb_backend.data.models.Ingredient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsRestController {

    //TODO: replace with live DB
    MockIngredients db = new MockIngredients();

    @GetMapping("/")
    public List<Ingredient> getAllIngredients() {
        return db.getAllIngredients();
    }

    @GetMapping("/{ingredient}")
    public Ingredient getIngredientByName(@PathVariable String ingredient) {
        return db.getIngredientByName(ingredient);
    }

    @PostMapping("/{ingredient}")
    public String postIngredients(@PathVariable String ingredient) {
        return "Received call to POST with " + ingredient;
    }
}
