package design.patterns.abstractfactory.factory;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory
 */
public interface AbstractFactory<T> {
    T create(String type);
}
