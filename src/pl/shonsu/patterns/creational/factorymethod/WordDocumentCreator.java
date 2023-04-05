package pl.shonsu.patterns.creational.factorymethod;

class WordDocumentCreator extends DocumentCreator {
    @Override
    protected Document createDocument() {
        return new WordDocument();
    }
}
