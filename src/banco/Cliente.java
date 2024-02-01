package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentasCorrientes;

    public Cliente(String dni, String nombre, Set<Prestamo> prestamos,Set<CuentaCorriente> cuentasCorrientes) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = prestamos;
        this.cuentasCorrientes = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public Set<CuentaCorriente> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void setCuentasCorrientes(Set<CuentaCorriente> cuentasCorrientes) {
        this.cuentasCorrientes = cuentasCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentasCorrientes.add(cuentaCorriente);
    }
    @Override
    public String toString(){
        return this.dni + " - " + this.nombre;
    }
}
