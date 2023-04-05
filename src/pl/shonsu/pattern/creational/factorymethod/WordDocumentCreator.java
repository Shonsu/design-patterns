package pl.shonsu.pattern.creational.factorymethod;

class WordDocumentCreator extends DocumentCreator {
    @Override
    protected Document createDocument() {
        return new WordDocument();
    }
}
