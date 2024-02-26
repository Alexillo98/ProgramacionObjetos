package proyectoNetwork2;

import java.util.List;

public class Fotografia extends Publicacion{
    private String titulo;
    private String nombre;

    public Fotografia(double ID, int meGusta, String fecha, String titulo, String nombre){
        super(ID,meGusta,fecha);
        this.titulo = titulo;
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addMegusta(){
        setMeGusta(getMeGusta()+1);
    }

    @Override
    public String toString(){
        return "Titulo foto:" + this.titulo + "Nombre foto: " + this.nombre;
    }
}
