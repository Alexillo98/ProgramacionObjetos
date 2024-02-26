package proyectoNetwork;

import java.util.ArrayList;

public class MainNetwork {
    public static void main(String[] args) {
        int meGustasMaria = 0;
        double IDaleatorio = (Math.random() * 100) + 1;
        Mensaje msg1 = new Mensaje("Hola, que tal?");
        Usuario maria = new Usuario("Maria",25);
        Texto txt1 = new Texto(IDaleatorio,maria,"14-02-2024",meGustasMaria,new ArrayList<>(),msg1);


    }
}
