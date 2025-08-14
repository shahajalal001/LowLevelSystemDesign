package SOLID.ISP.BadCode;

public class SimplePrinter implements Machine{

    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scan'");
    }

    @Override
    public void copy(Document doc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

}
