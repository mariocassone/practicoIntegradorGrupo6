import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //A partir del esquema original propuesto, desarrollar un programa que lea un archivo de
        // partidos y otro de resultados, el primero correspondiente a una ronda y el otro que contenga
        //los pronósticos de una persona1
        //. Cada ronda debe tener una cantidad fija de partidos  por
        //ejemplo 2. El programa debe:
        //● Estar subido en un repositorio de GIT
        //● Tomar como argumento 2 rutas a cada archivo que se necesita
        //● Al leer las líneas de los archivos debe instanciar objetos de las clases propuestas
        //● Debe imprimir por pantalla el puntaje de la persona.




        try{
            Ronda ronda1 = new Ronda();
            List<String> archivo = Files.readAllLines(Paths.get("Archivo.de.partido.txt"));
            for (int i = 0; i < archivo.size(); i++){
            String[] linea = archivo.get(i).split(";");
            Partido p1 = new Partido(linea[0], Integer.parseInt(linea[1]), Integer.parseInt(linea[2]), linea[3]);
            ronda1.partidos[i] = p1;
            }
        } catch(
                IOException e) {
            System.out.println("error");
        }
    }
}
