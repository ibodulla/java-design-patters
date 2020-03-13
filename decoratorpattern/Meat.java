package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class Meat extends PizzaDecorator{

    private final Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Meat (14.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 14.25;
    }

}