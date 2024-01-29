public class Computer {
    private int numeroSerie;
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Computer(int numeroSerie, String marca, String modelo, String sistemaOperativo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }
    public Computer(int numeroSerie, String marca, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = "No tiene";
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString(){
        return this.numeroSerie + "\n\t" + this.marca + "\n\t" + this.modelo + "\n\t" + this.sistemaOperativo;
    }
}
