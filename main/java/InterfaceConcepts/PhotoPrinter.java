package InterfaceConcepts;

public class PhotoPrinter implements Printer{

    public void print(PrintConfiguration printConfiguration){
        var config = (PhotoPrintConfiguration)printConfiguration;
        System.out.println("===================Printing with Photo Printer=========================");
        System.out.println("Photo height: "+config.photoHeight());
        System.out.println("Photo width: "+config.photoWidth());
        System.out.println("Photo color mode: "+config.getColorMode());
    }
}
