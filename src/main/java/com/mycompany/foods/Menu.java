
package com.mycompany.foods;


import com.mycompany.values.DishTypes;
import java.util.ArrayList;


public class Menu {
    
    private ArrayList<Dish> dishList;
    
    public Menu(){
    this.dishList = new ArrayList<>();
    
    }
    
    public void addDish(Dish dish){
        this.dishList.add(dish);
    
    }
    
    
    public void showMenu(){
    for(Dish dish: dishList ){
        System.out.println(dish);
    }
       
    }
    
    
    public void showDishName(){
        System.out.println("            MENU");
        
        for(DishTypes dishType: DishTypes.values()){
            System.out.println("--- "+ dishType + "---");
            
            
            for( Dish dish:dishList){
                if(dish.getType() == dishType){
                    System.out.println(dish.getName());           
                }
            }
            
        }

        
    }
    
}
