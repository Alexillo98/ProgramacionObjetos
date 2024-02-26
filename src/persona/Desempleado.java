package persona;

public class Desempleado extends Persona{
    public Desempleado(String nombre, String direcciom){
        super(nombre, direcciom);
    }
    @Override
    public void origenIngresos(){
        System.out.println("Recibo el paro.");
    }
}
