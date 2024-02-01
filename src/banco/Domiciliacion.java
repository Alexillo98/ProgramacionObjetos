package banco;

public class Domiciliacion {
    private int numDom;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int numDom, CuentaCorriente cuentaCorriente) {
        this.numDom = numDom;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNumDom() {
        return numDom;
    }

    public void setNumDom(int numDom) {
        this.numDom = numDom;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString(){
        return "Numero domiciliacion" + this.numDom;
    }
}
