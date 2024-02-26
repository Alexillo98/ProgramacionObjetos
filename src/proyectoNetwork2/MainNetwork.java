package proyectoNetwork2;

import java.util.ArrayList;

public class MainNetwork {
    public static void main(String[] args) {
        double id = (Math.random() * 100) + 1;
        Usuario maria = new Usuario("Maria",id,new ArrayList<>());
            Mensaje msg1Maria = new Mensaje(id,0,"22-02-2024","Hola, que tal?");
        maria.addMensaje(msg1Maria);
            Fotografia foto1Maria = new Fotografia(id,0,"15-02-2024","imagen.jpg","Playa");
        maria.addFotografia(foto1Maria);

    }
}
