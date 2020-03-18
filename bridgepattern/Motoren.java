package design.patterns.bridgepattern;

/**
 * Ibodulla Ibodullaev created on 3/18/2020 inside the package - design.patterns.bridgepattern
 */
public class Motoren extends Car {

    private final Product product;
    private final String carType;

    public Motoren(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product " + product.productName() + " according to " + carType);
    }

}