package InterfaceConcepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintingApplication {
    public static void main(String[] args) {
        HpPrinterConfig printerConfig = new HpPrinterConfig();
        printerConfig.setPrinterModel("Epson");
        printerConfig.setPrinterNames("HP leaser jet 404");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //var printConfig = br.readLine()
    }
}
