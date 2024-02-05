package universidad;

import java.util.List;

public class Profesor {
    private String nombreProf;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(String nombreProf, Departamento departamento) {
        this.nombreProf = nombreProf;
        this.departamento = departamento;

    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return "Nombre profesor: " + this.nombreProf;
    }
}
