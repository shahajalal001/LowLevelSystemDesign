package SOLID.ISP.GoodCode;

public class SimplePrinter implements Printer{

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }

}
