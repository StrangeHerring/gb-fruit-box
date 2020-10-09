package ru.linkov.ss.fruit.box.service;

import ru.linkov.ss.fruit.box.model.box.Box;
import ru.linkov.ss.fruit.box.model.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class UniteService {
    public <F extends Fruit> Box<F> unite(Box<F> from, Box<F> to){
        List<F> fromFruits = from.getFruits();
        List<F> toFruits = to.getFruits();
        List<F> result = new ArrayList<F>();
        result.addAll(fromFruits);
        result.addAll(toFruits);
        return new Box<F>(result);
    }
}
