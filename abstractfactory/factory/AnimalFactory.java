package design.patterns.abstractfactory.factory;

import design.patterns.abstractfactory.animal.family.Animal;
import design.patterns.abstractfactory.animal.family.Cat;
import design.patterns.abstractfactory.animal.family.Dog;
import design.patterns.abstractfactory.animal.family.Duck;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory
 */
public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}