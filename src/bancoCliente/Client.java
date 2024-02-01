package bancoCliente;

import java.util.Set;

public class Client {
    private String dni;
    private Set<CompteCorrent> cuenta;
    private Set<Prestec> prestamos;

    public Client(String dni, Set<CompteCorrent> cuenta, Set<Prestec> prestamos) {
        this.dni = dni;
        this.cuenta = cuenta;
        this.prestamos = prestamos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<CompteCorrent> getCuenta() {
        return cuenta;
    }

    public void setCuenta(Set<CompteCorrent> cuenta) {
        this.cuenta = cuenta;
    }

    public Set<Prestec> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestec> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString(){
        return this.dni + " - " + this.cuenta + " - " + this.prestamos;
    }
}
