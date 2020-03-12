package design.patterns.abstractfactory.animal.family;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory
 */
public class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "GAV";
    }
}