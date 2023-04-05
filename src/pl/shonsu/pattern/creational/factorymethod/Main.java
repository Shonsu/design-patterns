package pl.shonsu.pattern.creational.factorymethod;

public class Main {
    public static void main(String[] args) {

        System.out.println("Process document with factory method inheritance:");

        DocumentCreator textCreator = new DocumentCreator();
        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentCreator excelCreator = new ExcelDocumentCreator();

        textCreator.doSomethingWithDocument();
        wordCreator.doSomethingWithDocument();
        excelCreator.doSomethingWithDocument();


        System.out.println("Process document without factory method inheritance:");

        ProcessDocument text = new ProcessDocument();
        ProcessDocument word = new ProcessDocument(new WordDocument());
        ProcessDocument excel = new ProcessDocument(new ExcelDocument());

        text.doSomethingWithDocument();
        word.doSomethingWithDocument();
        excel.doSomethingWithDocument();

        System.out.println("Process document with lambda supplier");

        ProcessDocumentWithLambdaSupplier test = new ProcessDocumentWithLambdaSupplier();
        test.doSomethingWithDocument(WordDocument::new);
        test.doSomethingWithDocument(TextDocument::new);
        test.doSomethingWithDocument(ExcelDocument::new);

    }
}
