package trabajadores;

public class Oficial extends Directivo{
    private String puesto;
    public Oficial(String nombre,String DNI,String puesto) {
        super(nombre,DNI);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString(){
        return "Oficial: " + super.getNombre();
    }
}
