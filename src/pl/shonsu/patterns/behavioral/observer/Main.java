package pl.shonsu.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new Publisher("java", "smalltalk");

        publisher.attach("java", new InquisitiveType(publisher, "Adam"));
        publisher.attach("java", new InquisitiveType(publisher, "Zuza"));
        publisher.attach("smalltalk", new InquisitiveType(publisher, "Grażka"));

        publisher.publishEvent("java");
        publisher.publishEvent("smalltalk");

    }
}
