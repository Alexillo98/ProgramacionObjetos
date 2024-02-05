package universidad;

import java.util.Set;

public class Facultad {
    private String nombreFac;
    private Set<Catedra> catedras;

    public Facultad(String nombreFac, Set<Catedra> catedras) {
        this.nombreFac = nombreFac;
        this.catedras = catedras;
    }

    public String getNombreFac() {
        return nombreFac;
    }

    public void setNombreFac(String nombreFac) {
        this.nombreFac = nombreFac;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return "Facultad: " + this.nombreFac;
    }
}
