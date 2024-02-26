package ordenador;

public class Ordenador {
    private String marca;
    private String tipo;

    public Ordenador(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void tipo(){
        System.out.println("Soy de tipo: " + tipo);
    }
}
