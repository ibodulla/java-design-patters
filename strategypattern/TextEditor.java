package design.patterns.strategypattern;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.strategypattern
 */
public class TextEditor {
    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    public void publisherText(String text){
        textFormatter.format(text);
    }
}