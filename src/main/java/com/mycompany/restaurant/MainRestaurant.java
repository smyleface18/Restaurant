/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurant;

import com.mycompany.foods.Dish;
import java.util.Scanner;
import com.mycompany.people.People;
import com.mycompany.values.DishTypes;
import com.mycompany.values.UserTypes;
import com.mycompany.values.DishVaration;
import java.util.ArrayList;
import com.mycompany.foods.Menu;

/**
 *
 * @author SCIS2PC08
 */
public class MainRestaurant {
    
    public static void main(String[] args) {
        
       People student         = new People(UserTypes.STUDENT, 1234, "Juan");
       People  techer         = new People(UserTypes.TECHER, 3443, "Jairo");
       People administrative  = new People(UserTypes.ADMINISTRATIVE, 2344, "chela");
       
       
       Dish   breakfast      = new Dish("huevos pericos",DishTypes.BREAKFAST,2, 3000);
     //  Dish   breakfastTwo      = new Dish(DishTypes.BREAKFAST,1, 3000, DishVaration.OPTION2);
       Dish   lunch          = new Dish("arepa ",DishTypes.LUNCH,0, 4000);
     // Dish   lunchTwo          = new Dish(DishTypes.BREAKFAST,5, 4000, DishVaration.OPTION2);
       Dish   dinner         = new Dish("arroz chinese ",DishTypes.DINNER,1, 3000);
     //  Dish   dinnerTwo         = new Dish(DishTypes.BREAKFAST,3, 3000, DishVaration.OPTION1);
       
        Menu menu = new Menu();
        
        menu.addDish(breakfast);
        menu.addDish(lunch);
        menu.addDish(dinner);
     
     
       Scanner read             = new Scanner(System.in);
       
       People arrayPeople[]={student,techer,administrative};
       Dish   arrayDish  []={breakfast,lunch,dinner};
       
        System.out.println("Codigo de la persona");
        int cod = read.nextInt();
        int i = 0;
        
        int size = arrayPeople.length;
        for ( i = 0; i < size; i++) {
            if(cod == arrayPeople[i].getId()){
             UserTypes peopleType =  arrayPeople[i].getType();
                System.out.println(peopleType);
                break;
            }
        }
        System.out.println("que acción quiere realizar esta persona?");
        System.out.println("- buy");
        System.out.println("- sell");
        String action = read.next();
        if(action.equalsIgnoreCase("buy")){
               arrayPeople[i].buy(breakfast, lunch, dinner);
        }
        else if (action.equalsIgnoreCase("sell")){
             arrayPeople[i].sell();
             

        }
        







        
        
        
    }
    
    
    
    
    
 
}
