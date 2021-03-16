package epam.com.JavaCollections.MainTask.Salad;
import epam.com.JavaCollections.MainTask.Salad.Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chef {

    public void makeSalad(ArrayList<Vegetable> vegetables) {
        System.out.print("Chef makes salad with ");
        for (Vegetable vegetable : vegetables) {
            System.out.print(vegetable.getName() + ", ");
        }
    }

    public void sumColorieContent(ArrayList<Vegetable> vegetables) {
        int commonCalorie = 0;
        for (Vegetable vegetable : vegetables) {
            commonCalorie += vegetable.getColorieContent();
        }
        System.out.println("common calories of this salad: " + commonCalorie);
        System.out.println();
    }

    public void findVegetablesByCalories(int fromCalories, int toCalories, ArrayList<Vegetable> vegetables) {
        ArrayList<Vegetable> vegetablesCalories = new ArrayList<>();
        for (Vegetable vegetable : vegetables) {
            if (vegetable.getColorieContent() >= fromCalories && vegetable.getColorieContent() <= toCalories) {
                vegetablesCalories.add(vegetable);
            }
        }
        System.out.println("Vegetables with calories from " + fromCalories + " to " + toCalories + " are: ");
        for (Vegetable veg : vegetablesCalories) {
            System.out.println(veg);
        }
        System.out.println();
    }

    public void sortVegetablesByWeight(List<Vegetable> vegetables) {
        Comparator<Vegetable> vegetablesComparator = Comparator.comparingInt(Vegetable::getWeight);
        vegetables.sort(vegetablesComparator);
        System.out.println("Vegetables sorted by weight: ");
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable);
        }
        System.out.println();
    }
}
