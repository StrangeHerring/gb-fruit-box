package ru.linkov.ss.fruit.box.model.fruit;

public class Apple extends Fruit {
    private String name;
    private double weight = 1.0;

    public Apple (String name, double weight){
        super(name, weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
