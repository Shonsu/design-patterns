package pl.shonsu.pattern.creational.factorymethod;

class ProcessDocument {

    private Document document;

    public ProcessDocument() {
        this.document = new TextDocument();
    }

    public ProcessDocument(Document document) {
        this.document = document;
    }

    public void doSomethingWithDocument() {
        document.open();
        document.write();
    }

}
