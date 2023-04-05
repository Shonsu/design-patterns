package pl.shonsu.patterns.creational.factorymethod;

class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    @Override
    public void write() {
        System.out.println("Text document closed");
    }
}
