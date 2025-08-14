package SOLID.LSP.GoodCode;

public class Main {
    public static void readAnyFile(Readable file){
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadonlyFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read();
        writeableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);
    }
}
