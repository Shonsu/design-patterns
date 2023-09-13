package pl.shonsu.patterns.behavioral.visitor;

public class Museum implements Building {
    private final String museumName;

    public Museum(String museumName) {
        this.museumName = museumName;
    }

    public String getMuseumName() {
        return museumName;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitMuseum(this);
    }
}
