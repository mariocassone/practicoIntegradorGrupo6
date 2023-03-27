public class Ronda {
    int numero;
    String resultado = "";
    Partido[] partidos;

    public Ronda() {
        this.partidos = new Partido[2];
    }
    public String resultadoDelPartido(Partido p1){
            if(p1 != null) {
                if (p1.golesEquipo1 > p1.golesEquipo2) {
                    resultado = "1";
                } else if (p1.golesEquipo2 > p1.golesEquipo1) {
                    resultado = "2";
                } else {
                    resultado = "0";
            }
        }return resultado;
    }
    public String resultadoDelPartido(){
        for(Partido p1 : partidos) {
            if(p1 != null) {
                if (p1.golesEquipo1 > p1.golesEquipo2) {
                    resultado = p1.equipo1;
                } else if (p1.golesEquipo2 > p1.golesEquipo1) {
                    resultado = p1.equipo2;
                } else {
                    resultado = "Empate";
                }
            }
        }return resultado;
    }
}