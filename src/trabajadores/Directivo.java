package trabajadores;

public class Directivo extends Empleado implements Trabajar{
    public Directivo(String nombre,String DNI) {
        super(nombre,DNI);
    }
    @Override
    public String toString(){
        return "Directivo: " + super.getNombre();
    }

    @Override
    public void trabajar() {
        System.out.println("Yo no trabajo mucho.");
    }
}
