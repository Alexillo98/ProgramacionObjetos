package proyectoNetwork2;

public class Comentario extends Publicacion{
    private String comentario;

    public Comentario(double ID, int meGusta, String fecha, String comentario) {
        super(ID, meGusta, fecha);
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString(){
        return this.comentario;
    }
}
