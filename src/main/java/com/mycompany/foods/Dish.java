/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foods;

import com.mycompany.restaurant.MainRestaurant;
import java.util.Scanner;
import com.mycompany.values.DishTypes;
import com.mycompany.values.DishVaration;

/**
 *
 * @author SCIS2PC08
 */
public class Dish {
    
    Scanner read = new Scanner(System.in);
    
    String name;
    DishTypes type;
    int stock;
    int price;
    //DishVaration variation;

    public Dish(String name,DishTypes type, int stock, int price ) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
       
    }
    @Override
    public String toString(){
        return name + type+stock +price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public DishTypes getType() {
        return type;
    }

    public void setType(DishTypes type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public DishVaration getVariation() {
//        return variation;
//    }
//
//    public void setVariation(DishVaration variation) {
//        this.variation = variation;
//    }
    
    
    
    
    
}
