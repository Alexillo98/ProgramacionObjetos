package persona;

public class Trabajador extends Persona{

    public Trabajador (String nombre, String direccion){
        super(nombre, direccion);
    }
    @Override
    public void origenIngresos(){
        System.out.println("Recibo sueldo.");
    }

}
