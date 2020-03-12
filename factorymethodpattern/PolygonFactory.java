package design.patterns.factorymethodpattern;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.factorymethodpattern
 */
public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides){
        switch (numberOfSides){
            case 3:{
                return new Triangle();
            }
        }
        return null;
    }
}