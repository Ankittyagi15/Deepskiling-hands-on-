package Factory_method;

public class Factory {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfFactory();
        Document pdf = factory.createDocument();
        pdf.open();

        DocumentFactory factory1 = new WordFactory();
        Document word = factory1.createDocument();
        word.open();

        DocumentFactory factory2 = new ExcelFactory();
        Document excel = factory2.createDocument();
        excel.open();
    }
}

interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document");
    }
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    Document createDocument() {
        return new ExcelDocument();
    }
}
