package SOLID.ISP.GoodCode;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        MultiPurposeMachine multiPurposeMachine = new MultiPurposeMachine();
        multiPurposeMachine.copy(doc);
        multiPurposeMachine.print(doc);
        multiPurposeMachine.scan(doc);

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(doc);
    }
}
