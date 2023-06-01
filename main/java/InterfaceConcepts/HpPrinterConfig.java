package InterfaceConcepts;

public class HpPrinterConfig implements PrinterConfiguration{
    private String printerName;
    private String printerModel;

    public void setPrinterNames(String printerNames){
        this.printerName = printerNames;
    }

    public void setPrinterModel(String printerModel){
        this.printerModel = printerModel;
    }

    @Override
    public String getPrinterName() {
        return this.printerName;
    }

    @Override
    public String getPrinterModel() {
        return this.printerModel;
    }
}
