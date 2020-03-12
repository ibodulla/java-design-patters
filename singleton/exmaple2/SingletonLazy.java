package design.patterns.singleton.exmaple2;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.singleton.exmaple2
 */
public class SingletonLazy {
    private static SingletonLazy sc = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (sc == null) {
            sc = new SingletonLazy();
        }
        return sc;
    }
}