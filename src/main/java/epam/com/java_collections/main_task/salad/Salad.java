package epam.com.java_collections.main_task.salad;

import epam.com.java_collections.main_task.salad.vegetables.*;

import java.awt.*;
import java.util.ArrayList;

public class Salad {

    public static void main(String[] args) {
        ArrayList<Vegetable> vegetableInSalad = new ArrayList<>();
        vegetableInSalad.add(new VegetableBuilder(new Tomato()).setName("Tomato Cherry").setColor(Color.RED).setPrice(35).setWeight(50).setColorieContent(24).build());
        vegetableInSalad.add(new VegetableBuilder(new Cucumber()).setName("Cucumber Short").setColor(Color.GREEN).setPrice(28).setWeight(135).setColorieContent(16).build());
        vegetableInSalad.add(new VegetableBuilder(new Carrot()).setName("Carrot Natan").setColor(Color.ORANGE).setPrice(16).setWeight(130).setColorieContent(35).build());
        vegetableInSalad.add(new VegetableBuilder(new Pepper()).setName("Sweet Pepper").setColor(Color.YELLOW).setPrice(40).setWeight(220).setColorieContent(27).build());

        Chef chef = new Chef();

        chef.makeSalad(vegetableInSalad);
        chef.sumColorieContent(vegetableInSalad);
        chef.findVegetablesByCalories(20, 30, vegetableInSalad);
        chef.sortVegetablesByWeight(vegetableInSalad);

    }
}
