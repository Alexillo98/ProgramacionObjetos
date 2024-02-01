package banco;

import java.util.Set;

public class Banco {
    private int nEnt;
    private String nombre;

    private Set<Sucursal> sucursales;

    public Banco(int nEnt, String nombre,Set<Sucursal> sucursales) {
        this.nEnt = nEnt;
        this.nombre = nombre;
        this.sucursales = sucursales;
    }

    public int getnEnt() {
        return nEnt;
    }

    public void setnEnt(int nEnt) {
        this.nEnt = nEnt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Número entidad: " + this.nEnt + " Nombre banco: " + this.nombre;
    }
}
