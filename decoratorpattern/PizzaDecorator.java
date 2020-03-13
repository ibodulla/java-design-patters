package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDesc() {
        return "Toppings";
    }
}