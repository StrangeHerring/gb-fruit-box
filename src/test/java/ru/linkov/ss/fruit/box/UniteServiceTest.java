package ru.linkov.ss.fruit.box;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.linkov.ss.fruit.box.model.box.Box;
import ru.linkov.ss.fruit.box.model.fruit.Apple;
import ru.linkov.ss.fruit.box.model.fruit.Orange;
import ru.linkov.ss.fruit.box.service.UniteService;

public class UniteServiceTest {
    UniteService uniteService = new UniteService();
    Box<Apple> boxFrom = new Box<Apple>(
            new Apple(2),
            new Apple(3),
            new Apple(4));
    Box<Apple> boxTo = new Box<Apple>(
            new Apple(10)
    );


    @Test
    public void uniteBox(){

        System.out.println("Масса первой коробки: " + boxFrom.getWeight());
        System.out.println("Масса второй коробки: " + boxTo.getWeight());
        double weightBefore = boxFrom.getWeight() + boxTo.getWeight();
        System.out.println("Масса новой коробки: " + uniteService.unite(boxFrom, boxTo).getWeight());

        Assertions.assertTrue(uniteService.unite(boxFrom, boxTo).getWeight() == weightBefore);
    }

    @Test
    public void compareTest(){
        Box<Orange> firstBox = new Box<Orange>(
                new Orange(4));
        Box<Orange> secondBox = new Box<Orange>(
                new Orange(2),
                new Orange(2));

        Assertions.assertEquals(firstBox.compare(secondBox), true);
    }
}
