package InterfaceConcepts;

abstract class AbstractPrint implements Printer {

    private PrinterConfiguration printerConfiguration;

    public void connectPrinter (PrinterConfiguration printerConfiguration){
        this.printerConfiguration = printerConfiguration;
        System.out.println(" ==============The following printer is selected ============");
        System.out.println("Select printer model: " + printerConfiguration.getPrinterModel());
        System.out.println("Select printer name: " + printerConfiguration.getPrinterName());
        System.out.println(" ============================================================");
    }

    @Override
    public void print(PrintConfiguration printConfiguration) {
        Printer printer;
        if (printConfiguration instanceof PhotoPrintConfiguration){
            printer = new PhotoPrinter();
            printer.print(printConfiguration);
        }else if (printConfiguration instanceof DocumentPrintConfiguration){
            printer = new DocumentPrinter();
            printer.print(printConfiguration);
        }
    }
}
