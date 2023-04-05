package pl.shonsu.pattern.creational.factorymethod;

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Word document opened");
    }

    @Override
    public void write() {
        System.out.println("Word document closed");
    }
}
