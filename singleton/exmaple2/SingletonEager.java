package design.patterns.singleton.exmaple2;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.singleton.exmaple2
 */
public class SingletonEager {
    private static SingletonEager sc = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return sc;
    }
}