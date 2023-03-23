import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        String leerArchivoPartido = "src/Archivo.de.partido.txt";
        String leerArchivoResultado = "src/Archivo.de.resultado.txt";
    }

    String leerYComparar(String pathString){
        String resultado = "";
        for(String linea:Files.readAllLines(Paths.get(pathString))){
            if(Float.parseFloat(linea) - Float.parseFloat(linea) > 0){
                resultado = "gano";
            }
            else if(Float.parseFloat(linea) - Float.parseFloat(linea) < 0){
                resultado = "perdio";
            } else{
                resultado = "empate";
            }

            }
        System.out.println(resultado);
        }



}