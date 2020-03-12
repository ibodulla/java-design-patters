package design.patterns.strategypattern;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.strategypattern
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}