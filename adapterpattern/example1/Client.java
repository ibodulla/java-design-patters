package design.patterns.adapterpattern.example1;

/**
 * Ibodulla Ibodullaev created on 3/12/2020 inside the package - design.patterns.adapterpattern.exmaple2
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adatptee());
        target.request();
    }
}