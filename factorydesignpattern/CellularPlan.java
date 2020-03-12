package design.patterns.factorydesignpattern;

/**
 * Ibodulla Ibodullaev created on 3/6/2020 inside the package - designpatterns.factorydesignpattern
 */
public abstract class CellularPlan {
    protected double rate;

    abstract void getRate();

    public void processBill(int minutes) {
        System.out.println(minutes * rate);
    }
}