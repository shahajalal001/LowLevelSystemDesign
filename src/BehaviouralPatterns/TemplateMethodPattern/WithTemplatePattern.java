package BehaviouralPatterns.TemplateMethodPattern;

abstract class DataParser{
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening File");
    }
    protected void closeFile(){
        System.out.println("Closing File");
    }
    protected abstract void parseData();
}

class CSVParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}

class JSONParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParserII();
        DataParser jsonParser = new JSONParserII();

        csvParser.parse();
        jsonParser.parse();
    }
}
