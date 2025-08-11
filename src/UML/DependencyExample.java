package UML;

class Document {
    private final String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    public void print(Document doc){
        System.out.println("Printing document: " + doc.getContent());
    }
}

public class DependencyExample {
    public static void main(String[] args) {
        Document doc = new Document("Hey Doc");
        Printer printer = new Printer();

        printer.print(doc);
    }
}
