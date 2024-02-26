package proyectoNetwork2;


public abstract class Publicacion {
    private double ID;
    private int meGusta;
    private String fecha;
    private Usuario usuario;

    public Publicacion(double ID, int meGusta, String fecha) {
        this.ID = ID;
        this.meGusta = meGusta;
        this.fecha = fecha;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
