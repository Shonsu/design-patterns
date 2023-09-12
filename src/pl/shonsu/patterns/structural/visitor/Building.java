package pl.shonsu.patterns.structural.visitor;

public interface Building {
    String accept(Visitor visitor);
}
