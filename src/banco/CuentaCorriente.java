package banco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private int numCC;
    private int cantidad;
    private Sucursal sucursal;
    private Set<Cliente> clientes;

    private Set<Domiciliacion> domiciliaciones;

    public CuentaCorriente(int numCC, int cantidad, Sucursal sucursal, Set<Cliente> clientes,Set<Domiciliacion> domiciliaciones) {
        this.numCC = numCC;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.clientes = clientes;
        this.domiciliaciones = new HashSet<>();
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
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

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }
    @Override
    public String toString(){
        return "Numero cuenta corriente: " + this.numCC + " Cantidad: " +this.cantidad;
    }
}
