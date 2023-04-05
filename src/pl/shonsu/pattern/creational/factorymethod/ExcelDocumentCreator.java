package pl.shonsu.pattern.creational.factorymethod;

class ExcelDocumentCreator extends DocumentCreator {

    @Override
    protected Document createDocument() {
        return new ExcelDocument();
    }
}

