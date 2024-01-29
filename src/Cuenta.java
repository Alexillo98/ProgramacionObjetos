public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(float cantidad){
        if (cantidad < 0){
            cantidad = 0;
        }else {
            this.cantidad += cantidad;
        }
    }

    public void retirar(float cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else {
            this.cantidad -= cantidad;
        }
    }
    @Override
    public String toString(){
        return this.titular + "\n\t" + this.cantidad;
    }
}
