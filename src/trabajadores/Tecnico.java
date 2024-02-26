package trabajadores;

public class Tecnico extends Operario implements Trabajar{
    public Tecnico(String nombre,String puesto,String DNI) {
        super(nombre,puesto,DNI);
    }
    @Override
    public String toString(){
        return "Tecnico: " + super.getNombre();
    }
    @Override
    public void trabajar() {
        System.out.println("Yo trabajo mucho.");
    }
}
