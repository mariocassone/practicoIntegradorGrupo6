public class Partido {
    String equipo1 = "";
    String equipo2 = "";
    int golesEquipo1;
    int golesEquipo2;
    int numeroDePartido;

    public Partido(){
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.equipo2 = equipo2;
    }
           public void nombreDelEquipo1(){
        System.out.println(equipo1);
    }
    public void nombreDelEquipo2(){
        System.out.println(equipo2);
    }
    public void cantidadDeGolEquipo1(){
        System.out.println(golesEquipo1);
    }
    public void cantidadDeGolEquipo2(){
        System.out.println(golesEquipo2);
    }
    public void setnumeroDePartido(int numeroDePartido){
        this.numeroDePartido = numeroDePartido;
    }

    public String resultadoDelPartido(){
        if(golesEquipo2 > golesEquipo1){
            return "2";
        }
        else if(golesEquipo1 > golesEquipo2){
            return "1";
        }
        else{
            return "0";
        }
    }
}
