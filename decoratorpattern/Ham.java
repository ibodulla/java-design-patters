package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class Ham extends PizzaDecorator {

    private final Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham (18.12)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 18.12;
    }

}