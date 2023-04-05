package pl.shonsu.pattern.creational.factorymethod;

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Excel document opened");
    }

    @Override
    public void write() {
        System.out.println("Excel document closed");
    }
}
