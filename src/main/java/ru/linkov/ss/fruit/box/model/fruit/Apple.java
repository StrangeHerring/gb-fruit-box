package ru.linkov.ss.fruit.box.model.fruit;

public class Apple extends Fruit {
    private double weight;

    public Apple (double weight){
        super(weight);
    }

    public double getWeight() {
        return weight;
    }
}
