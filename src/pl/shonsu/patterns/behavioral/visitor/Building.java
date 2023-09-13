package pl.shonsu.patterns.behavioral.visitor;

public interface Building {
    String accept(Visitor visitor);
}
