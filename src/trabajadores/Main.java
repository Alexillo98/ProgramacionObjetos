package trabajadores;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directivo d1 = new Directivo("Pepe","10031X");
        Directivo d2 = new Directivo("Laura","917823F");
        Oficial o1 = new Oficial("Maria","126378K","Envios");
        Oficial o2 = new Oficial("Gregorio","987123R","Marketing");
        Tecnico t1 = new Tecnico("Alma","Carretilla","475893G");
        Tecnico t2 = new Tecnico("Paula","Resposicion","138392T");

        List<Directivo> directivos = new ArrayList<>();
        directivos.add(d1);
        directivos.add(d2);

        List<Oficial> oficiales = new ArrayList<>();
        oficiales.add(o1);
        oficiales.add(o2);

        List<Tecnico> tecnicos = new ArrayList<>();
        tecnicos.add(t1);
        tecnicos.add(t2);

        for(Directivo d: directivos){
            System.out.println(d);
        }
        d1.trabajar();
        for (Oficial o: oficiales){
            System.out.println("\t" + o + " " + o.getDNI() + " " + o.getPuesto());
        }
        for (Tecnico t: tecnicos){
            System.out.println("\t\t" + t + " " + t.getPuesto() + " " + t.getDNI());
        }
        t1.trabajar();
    }
}
