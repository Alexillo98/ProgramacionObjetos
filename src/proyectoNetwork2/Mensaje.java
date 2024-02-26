package proyectoNetwork2;


import java.util.List;

public class Mensaje extends Publicacion {

    private String mensaje;

    public Mensaje (double ID,int meGusta,String fecha, String mensaje){
        super(ID,meGusta,fecha);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void addMegusta(){
        setMeGusta(getMeGusta()+1);
    }

    @Override
    public String toString(){
        return "Mensaje: " + this.mensaje;
    }
}
