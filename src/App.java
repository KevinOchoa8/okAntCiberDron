import java.util.Scanner;

import okAppComponent.okConsoleApp.okSistemaRuso;
import okBusinessComponent.okEntities.okAutomata;

public class App {
    public static void main(String[] args) throws Exception {

        okSistemaRuso sistemaRuso = new okSistemaRuso();
        try{
            sistemaRuso.readCoord("DataFile\\pat_mic.csv");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        okAutomata automata = new okAutomata();
        Scanner okTipoArsenal = new Scanner("a ,ab ,abc ,abcd ").useDelimiter(",");

        while (okTipoArsenal.hasNext())
            System.out.println( automata.okcheckTipoArsenal(okTipoArsenal.next()) ? "OK" : "ERROR");
        okTipoArsenal.close();
        
    }


}
