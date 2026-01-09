package okAppComponent.okConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import okBusinessComponent.okEntities.okCoordenadaUK;

public class okSistemaRuso {

    public List<okCoordenadaUK> readCoord(String fileNamePath) throws IOException {
    List<okCoordenadaUK> lstCoord = new java.util.ArrayList<>();
    List<String> allLines = Files.readAllLines(Paths.get(fileNamePath));
    for (String line : allLines) {
        System.out.println(line);
        String[] coord = line.split(",");
        okCoordenadaUK coordenada = new okCoordenadaUK(coord[0], coord[6], false);
        lstCoord.add(coordenada);
        System.out.println(coordenada.toString());
    }
    return lstCoord;
}

}
