package universidad;

import java.util.Set;

public class Area {
    private String nombreArea;
    private Set<Departamento> departamentos;

    public Area(String nombreArea, Set<Departamento> departamentos) {
        this.nombreArea = nombreArea;
        this.departamentos = departamentos;
    }
    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString(){
        return "Nombre área: " + this.nombreArea;
    }
}
