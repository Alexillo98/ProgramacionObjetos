package subasta;

import java.util.Set;

public class Pujador {
    private String nombre;
    private Set<Puja> pujas;

    public Pujador(String nombre, Set<Puja> pujas) {
        this.nombre = nombre;
        this.pujas = pujas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addPuja(Puja puja){
        pujas.add(puja);
    }

    @Override
    public String toString(){
        return "Pujador: " + this.nombre;
    }
}
