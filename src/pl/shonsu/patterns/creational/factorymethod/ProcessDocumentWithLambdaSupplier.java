package pl.shonsu.patterns.creational.factorymethod;

import java.util.function.Supplier;

class ProcessDocumentWithLambdaSupplier {
    public void doSomethingWithDocument(Supplier<Document> document) {
        Document doc = document.get();
        doc.open();
        doc.write();
    }
}
