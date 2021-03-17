package epam.com.JavaCollections.MainTask.Salad.Vegetables;

import java.awt.*;

public class Cucumber extends Vegetable {

    public Cucumber(int weight, String name, int colorieContent, int price, Color color) {
        super(weight, name, colorieContent, price, color);
    }

    @Override
    public String toString() {
        return "Cucumber," + super.toString();
    }
}
