package biblioteca;

import java.util.Set;

public class Editorial {
    private int codEditorial;
    private String nombreEditorial;
    private Set<Libro> libros;

    public Editorial(int codEditorial, String nombreEditorial, Set<Libro> libros) {
        this.codEditorial = codEditorial;
        this.nombreEditorial = nombreEditorial;
        this.libros = libros;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
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
        return "Editorial: " + this.nombreEditorial + " | Código editorial: " + this.codEditorial;
    }
}
