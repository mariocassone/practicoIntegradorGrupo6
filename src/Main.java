import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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





        String archivoPartido = "src/Archivo.de.partido.txt";
        Ronda ronda1 = new Ronda();

        try {

                List<String> archivo = Files.readAllLines(Paths.get(archivoPartido));
                for (int i = 0; i < archivo.size(); i++) {
                    String[] linea = archivo.get(i).split(";");
                    Partido p1 = new Partido();
                    p1.equipo1 = linea[0];
                    p1.golesEquipo1 = Integer.parseInt(linea[1]);
                    p1.golesEquipo2 = Integer.parseInt(linea[2]);
                    p1.equipo2 = linea[3];
                    ronda1.partidos[i] = p1;
                    System.out.println(ronda1.resultadoDelPartido());
                }
                //System.out.println(ronda1.resultadoDelPartido());
            }
        catch(IOException e){
                System.out.println("error");
            }
        try {
            archivoPartido = "src/Archivo.de.resultado.txt";
            List<String> archivo = Files.readAllLines(Paths.get(archivoPartido));
            int puntos = 0;
            for (int i = 0; i < archivo.size(); i++) {
                String linea = archivo.get(i);
                Partido p1 = ronda1.partidos[i];
                if(linea.equals(p1.resultadoDelPartido())){
                    puntos += 1;
                }
            } System.out.println("El jugador gano " + puntos);

        }catch (IOException e){
            System.out.println("error2");
        }


        }
    }

