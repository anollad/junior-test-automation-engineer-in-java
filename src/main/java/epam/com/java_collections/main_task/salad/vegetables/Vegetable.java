package epam.com.java_collections.main_task.salad.vegetables;

import java.awt.*;

public class Vegetable {

    private String name;
    private int weight;
    private int colorieContent;
    private int price;
    private Color color;

    public Vegetable() {
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getColorieContent() {
        return colorieContent;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColorieContent(int colorieContent) {
        this.colorieContent = colorieContent;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " weight=" + weight +
                ", colorieContent=" + colorieContent;
    }
}
