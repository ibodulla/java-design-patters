package design.patterns.abstractfactory.factory;

import design.patterns.abstractfactory.color.family.Black;
import design.patterns.abstractfactory.color.family.Brown;
import design.patterns.abstractfactory.color.family.Color;
import design.patterns.abstractfactory.color.family.White;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.abstractfactory.factory
 */
public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(colorType)) {
            return new Black();
        } else if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        }
        return null;
    }
}