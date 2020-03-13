package design.patterns.decoratorpattern;

import java.text.DecimalFormat;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class DemoDecoratorPattern {

    public static void main(String[] args) {
        DecimalFormat dFormat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();

        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);

        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dFormat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();

        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Meat(pizza);
        pizza = new Ham(pizza);

        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + dFormat.format(pizza.getPrice()));
    }
}