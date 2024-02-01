package banco;

import bancoCliente.Client;

public class Prestamo {
    private int numP;
    private int cantidad;
    private Sucursal sucursal;
    private Cliente cliente;
    public Prestamo(int numP, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.numP = numP;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString(){
        return "Numero prestamo: " + this.numP + " Cantidad :" + this.cantidad;
    }
}
