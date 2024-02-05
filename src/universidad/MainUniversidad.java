package universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainUniversidad {
    public static void main(String[] args) {
        Area ciencias = new Area("Ciencias", new HashSet<>());
            Departamento biologia = new Departamento("Biologia", ciencias,new ArrayList<>(),new HashSet<>());
            Departamento quimica = new Departamento("Quimica",ciencias,new ArrayList<>(),new HashSet<>());
            ciencias.addDepartamento(biologia);
            ciencias.addDepartamento(quimica);
            Facultad salud = new Facultad("Salud",new HashSet<>());
            Catedra cuerpoHumano = new Catedra("Cuerpo humano",biologia,salud,new ArrayList<>());
            Catedra inorganica = new Catedra("Quimica inorganica",quimica,salud,new ArrayList<>());
            biologia.addCatedra(cuerpoHumano);
            quimica.addCatedra(inorganica);
            salud.addCatedra(cuerpoHumano);
            salud.addCatedra(inorganica);
                Profesor paco = new Profesor("Paco",biologia);
                Profesor maria = new Profesor("Maria",quimica);
                biologia.addProfesor(paco);
                quimica.addProfesor(maria);
                Adscrito adsPaco = new Adscrito(cuerpoHumano,paco,"2023-09-23");
                Adscrito adsMaria = new Adscrito(inorganica,maria,"2022-07-21");
                cuerpoHumano.addAdscrito(adsPaco);
                inorganica.addAdscrito(adsMaria);
        Area letras = new Area("Letras",new HashSet<>());
            Departamento castellano = new Departamento("Castellano",letras,new ArrayList<>(),new HashSet<>());
            Departamento ingles = new Departamento("Inglés",letras,new ArrayList<>(),new HashSet<>());
            letras.addDepartamento(castellano);
            letras.addDepartamento(ingles);
            Facultad humanas = new Facultad("Ciencias humanas", new HashSet<>());
            Catedra autores = new Catedra("Historia de autores", castellano,humanas,new ArrayList<>());
            Catedra tiempos = new Catedra("Tiempos verbales",ingles,humanas,new ArrayList<>());
            castellano.addCatedra(autores);
            ingles.addCatedra(tiempos);
            humanas.addCatedra(autores);
            humanas.addCatedra(tiempos);
                Profesor alejandro = new Profesor("Alejandro",castellano);
                Profesor laura = new Profesor("Laura",ingles);
                castellano.addProfesor(alejandro);
                ingles.addProfesor(laura);
                Adscrito adsAlejandro = new Adscrito(autores,alejandro,"2020-01-25");
                Adscrito adsLaura = new Adscrito(tiempos,laura,"2019-02-15");
                autores.addAdscrito(adsAlejandro);
                tiempos.addAdscrito(adsLaura);


        List<Area> areas = new ArrayList<>();
        areas.add(ciencias);
        areas.add(letras);

        for(Area a:areas) {
            System.out.println(a);
            for (Departamento d : a.getDepartamentos()) {
                System.out.println("\t" + d);
                for(Profesor p: d.getProfesores()){
                    System.out.println("\t\t" + p);
                }
                for(Catedra c: d.getCatedras()){
                    System.out.println("\t\t\t" + c);
                    System.out.println("\t\t\t\t" + c.getFacultad());
                    System.out.println("\t\t\t\t\t" + c.getAdscritos());
                }
            }
        }
    }
}
