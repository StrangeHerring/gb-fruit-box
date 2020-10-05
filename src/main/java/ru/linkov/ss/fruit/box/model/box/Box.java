package ru.linkov.ss.fruit.box.model.box;

import ru.linkov.ss.fruit.box.model.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box {
    private List<Fruit> content;

    public Box(Fruit... content) {
        this.content = Arrays.asList(content);
    }

    public List<Fruit> getContent() {
        return content;
    }

    public double getWeight(Fruit... content){

    }

    public boolean compare (Box other){
        return getWeight().equals(other.getWeight()) ;
    }
}
