package bancoCliente;

import java.util.Set;

public class Banc {
    private String nombre;
    private int numEntidad;

    private Set<Sucursal> sucursales;

    public Banc(String nombre, int numEntidad, Set<Sucursal> sucursales) {
        this.nombre = nombre;
        this.numEntidad = numEntidad;
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEntidad() {
        return numEntidad;
    }

    public void setNumEntidad(int numEntidad) {
        this.numEntidad = numEntidad;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
