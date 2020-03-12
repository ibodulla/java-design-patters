package design.patterns.abstractfactory;

import design.patterns.abstractfactory.color.family.Color;
import design.patterns.abstractfactory.factory.AbstractFactory;
import design.patterns.abstractfactory.factory.FactoryProvider;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        Color cl = (Color) colorFactory.create("White");
        System.out.println(cl.getColor());
    }
}