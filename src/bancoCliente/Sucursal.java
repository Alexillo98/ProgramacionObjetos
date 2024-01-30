package bancoCliente;

public class Sucursal {
    private int numSucursal;
    private String direccion;
    private Banc banco;

    public Sucursal(int numSucursal, String direccion, Banc banco) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.banco = banco;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banc getBanco() {
        return banco;
    }

    @Override
    public String toString(){
        return this.numSucursal + "->" + this.direccion;
    }
}
