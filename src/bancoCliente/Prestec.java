package bancoCliente;

import java.util.HashSet;
import java.util.Set;

public class Prestec {
    private int cantidad;
    private int numPrestec;
    private Sucursal sucursal;
    private Client client;
    private Set<Prestec> prestamos;

    public Prestec(int cantidad, int numPrestec, Sucursal sucursal, Client client) {
        this.cantidad = cantidad;
        this.numPrestec = numPrestec;
        this.sucursal = sucursal;
        this.client = client;
        this.prestamos = new HashSet<>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumPrestec() {
        return numPrestec;
    }

    public void setNumPrestec(int numPrestec) {
        this.numPrestec = numPrestec;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addPrestamo(Prestec prestamo){
        this.prestamos.add(prestamo);
    }
    @Override
    public String toString(){
        return this.numPrestec + " - " + this.cantidad;
    }
}
