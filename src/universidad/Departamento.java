package universidad;

import java.util.List;
import java.util.Set;

public class Departamento {
    private String nombreDep;
    private Area area;
    private List<Profesor> profesores;
    private Set<Catedra> catedras;

    public Departamento(String nombreDep, Area area, List<Profesor> profesores,Set<Catedra> catedras) {
        this.nombreDep = nombreDep;
        this.area = area;
        this.profesores = profesores;
        this.catedras = catedras;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return "Nombre departamento: " + this.nombreDep;
    }
}
