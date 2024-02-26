package proyectoNetwork;

import java.util.List;
import java.util.Set;

public class Texto extends Publicacion{
    private double ID;
    private Usuario usuario;
    private String fecha;
    private int meGustas;
    private List<Comentario> comentarios;
    private Mensaje mensaje;

    public Texto(double ID, Usuario usuario, String fecha, int meGustas, List<Comentario> comentarios, Mensaje mensaje) {
        super(ID,usuario,fecha,meGustas,comentarios);
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

//    public List<Comentario> getComentarios() {
//        return comentarios;
//    }

//    public void setComentarios(List<Comentario> comentarios) {
//        this.comentarios = comentarios;
//    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "Mensaje: " + this.mensaje;
    }
}
