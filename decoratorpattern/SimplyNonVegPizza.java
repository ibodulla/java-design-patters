package design.patterns.decoratorpattern;

/**
 * Ibodulla Ibodullaev created on 3/13/2020 inside the package - design.patterns.decoratorpattern
 */
public class SimplyNonVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyNonVedPizza (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
