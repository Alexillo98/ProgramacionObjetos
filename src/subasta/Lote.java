package subasta;

import java.util.Set;

public class Lote {
    private String numero;
    private double precioSalida;
    private Set<Articulo> articulos;
    private Set<Puja> pujas;

    public Lote(String numero, double precioSalida, Set<Articulo> articulos,Set<Puja> pujas) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = articulos;
        this.pujas = pujas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }

    public double getPrecioLote(){
        return this.articulos.stream().mapToDouble(articulo -> articulo.getPrecio()).sum();
    }

    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    public void addPuja(Puja puja){
        pujas.add(puja);
    }

    @Override
    public String toString(){
        return "Numero lote: " + this.numero + "Precio salida lote" + this.precioSalida;
    }
}
