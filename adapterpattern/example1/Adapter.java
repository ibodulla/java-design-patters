package design.patterns.adapterpattern.example1;

/**
 * Ibodulla Ibodullaev created on 3/12/2020 inside the package - design.patterns.adapterpattern.exmaple2
 */
public class Adapter implements Target {

    private Adatptee adatptee;

    public Adapter(Adatptee adatptee) {
        this.adatptee = adatptee;
    }

    @Override
    public void request() {
        this.adatptee.specificRequest();
    }
}