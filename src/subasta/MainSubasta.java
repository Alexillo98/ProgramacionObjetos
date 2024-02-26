package subasta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainSubasta {
    public static void main(String[] args) {
        Lote lote1 = new Lote("1",0,new HashSet<>(),new HashSet<>());
            Articulo mesa = new Articulo("Mesa",50,lote1);
            Articulo silla = new Articulo("Silla",30,lote1);
            lote1.setPrecioSalida(lote1.getPrecioLote());
            Pujador paco = new Pujador("Paco",new HashSet<>());
                Puja pujaPaco = new Puja(170,lote1);
                paco.addPuja(pujaPaco);
            Pujador maria = new Pujador("Maria",new HashSet<>());
                Puja pujaMaria = new Puja(180,lote1);
                maria.addPuja(pujaMaria);
            lote1.addArticulo(mesa);
            lote1.addArticulo(silla);
        Lote lote2 = new Lote("2",150,new HashSet<>(),new HashSet<>());
            Articulo vajilla = new Articulo("Vajilla",40,lote2);
            Articulo armario = new Articulo("Armario",70,lote2);
            Articulo soporte = new Articulo("Soborte",30,lote2);
                Pujador alejandro = new Pujador("Alejandro",new HashSet<>());
                    Puja pujaAlejandro = new Puja(200,lote2);
                    alejandro.addPuja(pujaAlejandro);
                Pujador cris = new Pujador("Cris",new HashSet<>());
                    Puja pujaCris = new Puja(180,lote2);
                    cris.addPuja(pujaCris);
                Pujador jose = new Pujador("Jose",new HashSet<>());
                    Puja pujaJose = new Puja(160,lote2);
                    jose.addPuja(pujaJose);
            lote2.addArticulo(vajilla);
            lote2.addArticulo(armario);
            lote2.addArticulo(soporte);

            List<Pujador> pujadoresL1 = new ArrayList<>();

            pujadoresL1.add(paco);
            pujadoresL1.add(maria);

            List<Puja> pujasL1 = new ArrayList<>();

            pujasL1.add(pujaPaco);
            pujasL1.add(pujaMaria);

            float cantidad = 0;
            String mayorPujador = "";

            for(int i = 0; i < pujasL1.size() -1; i++){
                if (pujasL1.get(i).getCantidad() < pujasL1.get(i+1).getCantidad()){
                    cantidad = pujasL1.get(i+1).getCantidad();
                    mayorPujador = pujadoresL1.get(i+1).getNombre();
                }else {
                    cantidad = pujasL1.get(i).getCantidad();
                    mayorPujador = pujadoresL1.get(i).getNombre();
                }
            }

        System.out.println(cantidad + mayorPujador);
        System.out.println(lote1.getPrecioLote());
    }
}
