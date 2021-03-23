package epam.com.java_collections.main_task.salad;

import epam.com.java_collections.main_task.salad.vegetables.*;

import java.awt.*;
import java.util.ArrayList;

public class Salad {

    public static void main(String[] args) {
        ArrayList<Vegetable> vegetableInSalad = new ArrayList<>();
        vegetableInSalad.add(new Tomato(100,"Tomato",24,50, Color.RED));
        vegetableInSalad.add(new Cucumber(135,"Cucumber",16,25, Color.GREEN));
        vegetableInSalad.add(new Carrot(130,"Carrot",35,30, Color.ORANGE));
        vegetableInSalad.add(new SweetPepper(220,"SweetPepper",27,70, Color.YELLOW));

        Chef chef = new Chef();

        chef.makeSalad(vegetableInSalad);
        chef.sumColorieContent(vegetableInSalad);
        chef.findVegetablesByCalories(20, 30, vegetableInSalad);
        chef.sortVegetablesByWeight(vegetableInSalad);

    }
}