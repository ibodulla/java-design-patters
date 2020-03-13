package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Broccoli (9.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }
}