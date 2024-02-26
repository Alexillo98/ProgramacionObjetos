package subasta;

public class Puja {
    private float cantidad;
    private Lote lote;

    public Puja(float cantidad, Lote lote) {
        this.cantidad = cantidad;
        this.lote = lote;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString(){
        return "" + this.cantidad;
    }
}
