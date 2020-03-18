package design.patterns.bridgepattern;

/**
 * Ibodulla Ibodullaev created on 3/18/2020 inside the package - design.patterns.bridgepattern
 */
public class GearLocking implements Product {

    private final String productName;

    public GearLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

}