package universidad;

import java.util.List;

public class Catedra {
    private String nombreCat;
    private Departamento departamento;
    private Facultad facultad;
    private List<Adscrito> adscritos;

    public Catedra(String nombreCat, Departamento departamento,Facultad facultad,List<Adscrito> adscritos) {
        this.nombreCat = nombreCat;
        this.departamento = departamento;
        this.facultad = facultad;
        this.adscritos = adscritos;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(List<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }
    public void addAdscrito(Adscrito adscrito){
        this.adscritos.add(adscrito);
    }
    @Override
    public String toString(){
        return "Catedra: " + this.nombreCat;
    }
}
