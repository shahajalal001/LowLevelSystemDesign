package SOLID.ISP.BadCode;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        Machine multiPurposMachine = new MultiPurposeMachine();
        multiPurposMachine.print(doc);
        multiPurposMachine.copy(doc);
        multiPurposMachine.scan(doc);


        Machine simplePrinter = new SimplePrinter();
        simplePrinter.print(doc);
        simplePrinter.copy(doc);
        simplePrinter.scan(doc);
    }
}
