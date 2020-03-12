package design.patterns.strategypattern;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.strategypattern
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);

        editor.publisherText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);

        editor.publisherText("Testing text in lower formatter");
    }
}