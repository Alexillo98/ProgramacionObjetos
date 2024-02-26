package persona;

public class Informatico extends Trabajador {
    public Informatico (String nombre, String direccion){
        super(nombre, direccion);
    }
    public void programar(){
        System.out.println("Soy programador.");
    }
}
