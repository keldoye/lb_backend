package com.lb.lb_backend.data.mock;

import com.lb.lb_backend.data.models.Ingredient;
import com.lb.lb_backend.data.util.measurements.UnitsOfMeasure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MockIngredients implements Serializable {


    public MockIngredients() {
        this.list = load();
    }

    List<Ingredient> list;

    private List<Ingredient> load() {
        List<Ingredient> list = new ArrayList<>();

        list.add(new Ingredient(1, "basmati rice", UnitsOfMeasure.Units.GRAMS, 3.47));
        list.add(new Ingredient(2, "beans", UnitsOfMeasure.Units.GRAMS, 2.34));
        list.add(new Ingredient(3, "onions", UnitsOfMeasure.Units.UNITS, 1.00));
        list.add(new Ingredient(4, "tomato", UnitsOfMeasure.Units.UNITS, 1.30));

        return list;
    }

    //GET ALL
    public List<Ingredient> getAllIngredients() {
        return this.list;
    }

    //GET BY NAME
    public Ingredient getIngredientByName(String name) {
        Ingredient result = null;

        for (Ingredient ing: this.list) {
            if (ing.getName().equalsIgnoreCase(name)) {
                result = ing;
            }
        }

        return result;
    }

}
