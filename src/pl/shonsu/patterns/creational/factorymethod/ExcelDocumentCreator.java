package pl.shonsu.patterns.creational.factorymethod;

class ExcelDocumentCreator extends DocumentCreator {

    @Override
    protected Document createDocument() {
        return new ExcelDocument();
    }
}

