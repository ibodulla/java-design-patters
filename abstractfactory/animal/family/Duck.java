package design.patterns.abstractfactory.animal.family;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory
 */
public class Duck implements Animal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "CRACK";
    }
}