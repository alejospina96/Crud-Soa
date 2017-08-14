/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Daniel
 */
public class Product {
    private long id;
    private String description;
    private double value;

    public Product(long id, String description, double value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

   
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return id+": "+description+" - $"+value;
    }
    
}
