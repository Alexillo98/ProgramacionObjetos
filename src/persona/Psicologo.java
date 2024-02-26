package persona;

public class Psicologo extends Desempleado {
    public Psicologo (String nombre, String direccion){
        super(nombre, direccion);
    }
    @Override
    public void origenIngresos(){
        System.out.println("Recibo el paro.");
    }
    public void doyClases(){
        System.out.println("Doy clases particulares.");
    }
}
