package ru.linkov.ss.fruit.box.model.fruit;

public class Orange extends Fruit {
    private String name;
    private double weight = 1.5;

    public Orange (String name, double weight){
        super(name, weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
