package ru.linkov.ss.fruit.box.model.box;

import ru.linkov.ss.fruit.box.model.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {
    private List<F> fruits;

    public Box(List<F> fruits) {
        this.fruits = fruits;
    }

    public Box(F... fruits){
        this.fruits = new ArrayList<F>(Arrays.asList(fruits));
    }

    public List<F> getFruits() {
        return fruits;
    }

    public double getWeight(){
        double sum = 0;
        for (F fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare (Box<?> other){
        return getWeight() == other.getWeight();
    }
}
