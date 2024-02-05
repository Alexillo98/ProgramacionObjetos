package biblioteca;

import java.util.Set;

public class Tema {
    private int codTema;
    private String nombreTema;

    private Set<Libro> libros;
    public Tema(int codTema, String nombreTema,Set<Libro> libros) {
        this.codTema = codTema;
        this.nombreTema = nombreTema;
        this.libros = libros;
    }

    public int getCodTema() {
        return codTema;
    }

    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString(){
        return "Nombre tema: " + this.nombreTema + "| Código tema: " + this.codTema;
    }
}
