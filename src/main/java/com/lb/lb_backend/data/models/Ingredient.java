package com.lb.lb_backend.data.models;

import java.io.Serializable;

public class Ingredient implements Serializable {

     public Ingredient(int id, String name, int unitOfMeasure, double costPerUnit) {
          this.id = id;
          this.name = name;
          this.unitOfMeasure = unitOfMeasure;
          this.costPerUnit = costPerUnit;
     }

     private int id;

     private String name;

     private int unitOfMeasure;

     private double costPerUnit;


}
