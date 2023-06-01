package InterfaceConcepts;

public class DocumentPrinter implements Printer{
    public void print(PrintConfiguration printConfiguration){
        var config = (DocumentPrintConfiguration)printConfiguration;
        System.out.println("===================Printing with Photo Printer=========================");
        System.out.println("Page Layout: "+config.pageLayout());
        System.out.println("Page size: "+config.pageSize());
        System.out.println("Photo color mode: "+config.getColorMode());
    }
}
