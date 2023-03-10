package com.lb.lb_backend.data.models;

import com.lb.lb_backend.data.util.measurements.UnitsOfMeasure;

import java.io.Serializable;


/**
 * Ingredient class used for recipes
 */
public class Ingredient implements Serializable {

     public Ingredient(int id, String name, UnitsOfMeasure.Units unitOfMeasure, Double costPerUnit) {
          this.id = id;
          this.name = name;
          this.unitOfMeasure = unitOfMeasure;
          this.costPerUnit = costPerUnit;
     }

     private int id;

     private String name;

     private UnitsOfMeasure.Units unitOfMeasure;

     private Double costPerUnit;

}
