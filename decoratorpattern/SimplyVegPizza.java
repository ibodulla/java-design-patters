package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class SimplyVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimpyVegPizza (230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}