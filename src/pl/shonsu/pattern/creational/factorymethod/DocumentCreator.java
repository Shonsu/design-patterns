package pl.shonsu.pattern.creational.factorymethod;

class DocumentCreator {

    public void doSomethingWithDocument() {
        Document doc = createDocument();
        doc.open();
        doc.write();
    }

    protected Document createDocument() {
        return new TextDocument();
    }
}
