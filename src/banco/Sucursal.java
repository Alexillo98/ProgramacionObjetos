package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int nSuc;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentasCorrientes;

    public Sucursal(int nSuc, String direccion, Banco banco, Set<Prestamo> prestamos,Set<CuentaCorriente> cuentasCorrientes) {
        this.nSuc = nSuc;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = prestamos;
        this.cuentasCorrientes = new HashSet<>();
    }

    public int getnSuc() {
        return nSuc;
    }

    public void setnSuc(int nSuc) {
        this.nSuc = nSuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public Set<Prestamo> getPrestamos(){
        return this.prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
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
        return "Sucursal: " + this.nSuc + " Direccion: " + this.direccion;
    }
}
