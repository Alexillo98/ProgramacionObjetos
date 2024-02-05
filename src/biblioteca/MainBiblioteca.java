package biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        Tema narrativa = new Tema(100,"Narrativa",new HashSet<>());
            Libro laBrujulaDorada = new Libro("1","La Brújula Dorada",narrativa);
            narrativa.addLibro(laBrujulaDorada);

        Tema policiaco = new Tema(200,"Policiaco",new HashSet<>());
            Libro elAsesinatoDePitagoras = new Libro("2","El asesinato de Pitágoras",policiaco);
            policiaco.addLibro(elAsesinatoDePitagoras);

        List<Tema> temas = new ArrayList<>();

        temas.add(narrativa);
        temas.add(policiaco);

        for(Tema t: temas){
            System.out.println(t);
            for(Libro l: t.getLibros()){
                System.out.println("\t" + l);
            }
        }
    }
}
