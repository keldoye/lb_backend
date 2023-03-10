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

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public UnitsOfMeasure.Units getUnitOfMeasure() {
          return unitOfMeasure;
     }

     public void setUnitOfMeasure(UnitsOfMeasure.Units unitOfMeasure) {
          this.unitOfMeasure = unitOfMeasure;
     }

     public Double getCostPerUnit() {
          return costPerUnit;
     }

     public void setCostPerUnit(Double costPerUnit) {
          this.costPerUnit = costPerUnit;
     }
}
