package biblioteca;

public class Libro {
    private String isbn;
    private String nombreLibro;
    private Tema tema;

    public Libro(String isbn, String nombreLibro, Tema tema) {
        this.isbn = isbn;
        this.nombreLibro = nombreLibro;
        this.tema = tema;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString(){
        return "Nombre libro: " + this.nombreLibro + "| ISBN:" + this.isbn;
    }
}
