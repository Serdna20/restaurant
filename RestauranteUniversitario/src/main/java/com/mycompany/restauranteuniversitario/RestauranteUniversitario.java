package com.mycompany.restauranteuniversitario;

import com.mycompany.restauranteuniversitario.customer.Customer;
import com.mycompany.restauranteuniversitario.food.Dish;
import com.mycompany.restauranteuniversitario.food.Menu;
import java.util.ArrayList;
import com.mycompany.restauranteuniversitario.values.CustomerRole;
import com.mycompany.restauranteuniversitario.values.DishType;

public class RestauranteUniversitario {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192228", "Charlotte");
        Customer teacher = new Customer(CustomerRole.TEACHER, "192220", "Liam");
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "192230", "Parker");
        
        Menu menu = new Menu(); 
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huevos, sal y pimienta", 2500, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo", "Carne, papa, ajos y sal", 2500, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa", "Pasta", 2500, 2);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        
        // FILTRAR PARA SOLO VER POR TIPO DE DISH TYPE        
        // System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        // Hacer para que muestre todo el menu
        menu.getMenu();
        System.out.println(teacher.getDishPrize(lunch1));
        System.out.println(student.getDishPrize(lunch1));
        System.out.println(administrative.getDishPrize(lunch1));
        
        // System.out.println(lunch1.getQuantity());
        
        student.buyFood(lunch1);
        administrative.buyFood(breakfast1);
        
    }
}
