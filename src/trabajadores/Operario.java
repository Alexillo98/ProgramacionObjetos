package trabajadores;

public class Operario extends Empleado{
    private String puesto;
    public Operario(String nombre, String puesto, String DNI) {
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
        return "Puesto: " + this.puesto;
    }
}
