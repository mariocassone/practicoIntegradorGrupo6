public class Equipo {
   String nombre;
   String descripcion;
    public Equipo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public void nombreDelEquipo(){
        System.out.println(nombre);
    }
    public void descripcionDelEquipo(){
        System.out.println(descripcion);
    }
}
