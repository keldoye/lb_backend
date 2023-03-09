package com.lb.lb_backend.data.models;

import com.lb.lb_backend.data.util.mesurements.UnitOfMesure;

import java.io.Serializable;

public class Ingredient implements Serializable {

     private int id;

     private String name;

     private UnitOfMesure mesurementUnit;

     private double costPerUnit;


}
