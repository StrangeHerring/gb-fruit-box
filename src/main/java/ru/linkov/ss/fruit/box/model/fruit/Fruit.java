package ru.linkov.ss.fruit.box.model.fruit;

public class Fruit {
    private String name;
    private double weight;

    public Fruit (String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
