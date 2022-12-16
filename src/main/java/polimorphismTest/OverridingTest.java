package polimorphismTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Printer{
    public abstract void print();
}

class PhotoPrinter extends Printer{

    @Override
    public void print(){
        System.out.println("Photo printer");
    }
}

class DocumentPrinter extends Printer{

    @Override
    public void print(){
        System.out.println("Document printer");
    }
}

class PlotterPrinter extends Printer{

    @Override
    public void print(){
        System.out.println("Plotter printer");
    }
}

public class OverridingTest {
    public static void main(String[] args) throws IOException {
        Printer printer;
        String printerType;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        printerType = br.readLine();

        while ((printerType = br.readLine()) != "bal") {
            switch (printerType) {
                case "document":
                    printer = new DocumentPrinter();
                    printer.print();
                    break;
                case "photo":
                    printer = new PhotoPrinter();
                    printer.print();
                    break;
                case "plotter":
                    printer = new PlotterPrinter();
                    printer.print();
                    break;
            }
        }
    }
}
