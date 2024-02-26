package proyectoNetwork;

import java.util.List;

public abstract class Publicacion {
    private double ID;
    private Usuario usuario;
    private String fecha;
    private int meGustas;
    private List<Comentario> comentarios;

    public Publicacion(double ID, Usuario usuario, String fecha, int meGustas, List<Comentario> comentarios) {
        this.ID = ID;
        this.usuario = usuario;
        this.fecha = fecha;
        this.meGustas = meGustas;
        this.comentarios = comentarios;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMeGustas() {
        return meGustas;
    }

    public void setMeGustas(int meGustas) {
        this.meGustas = meGustas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}