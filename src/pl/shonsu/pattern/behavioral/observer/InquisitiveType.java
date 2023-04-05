package pl.shonsu.pattern.behavioral.observer;

class InquisitiveType implements Observer{
    private String name;
    private final Publisher publisher;

    public InquisitiveType(Publisher publisher, String name) {
        this.publisher = publisher;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " has been informed about: \n" + publisher.getEvent());
    }
}
