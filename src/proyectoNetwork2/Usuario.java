package proyectoNetwork2;

import java.util.List;

public class Usuario{
    private String nombre;
    private List<Mensaje> mensajes;
    private List<Fotografia> fotografias;

    public Usuario(String nombre, double ID, List<Mensaje> mensajes) {
        this.nombre = nombre;
        this.mensajes = mensajes;
    }
    public Usuario(List<Fotografia> fotografias,double ID){
        this.fotografias = fotografias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }


    public List<Fotografia> getFotografias() {
        return fotografias;
    }

    public void setFotografias(List<Fotografia> fotografias) {
        this.fotografias = fotografias;
    }

    public void addMensaje(Mensaje mensaje){
        mensajes.add(mensaje);
    }

    public void addFotografia(Fotografia fotografia){
        fotografias.add(fotografia);
    }

}
