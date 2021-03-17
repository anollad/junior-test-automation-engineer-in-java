package epam.com.JavaCollections.MainTask.Salad.Vegetables;

import java.awt.*;

public class Vegetable {
    private int weight;
    private String name;
    private int colorieContent;
    private int price;
    private Color color;

    public int getColorieContent() {
        return colorieContent;
    }

    public void setColorieContent(int colorieContent) {
        this.colorieContent = colorieContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vegetable(int weight, String name, int colorieContent, int price, Color color) {
        this.weight = weight;
        this.name = name;
        this.colorieContent = colorieContent;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return " weight=" + weight +
                ", colorieContent=" + colorieContent;
    }
}
