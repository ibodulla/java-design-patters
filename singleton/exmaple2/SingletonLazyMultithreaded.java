package design.patterns.singleton.exmaple2;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.singleton.exmaple2
 */
public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded sc = null;

    private SingletonLazyMultithreaded() {
    }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        if (sc == null) {
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }

}