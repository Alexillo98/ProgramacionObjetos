package bancoCliente;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        Banc bbva = new Banc("BBVA",100, new HashSet<>());
            Sucursal sMayor = new Sucursal(11,"C/ Mayor",bbva);
            Sucursal sEnMedio = new Sucursal(12,"C/ Enmedio",bbva);
//                Prestec p1 = new Prestec(1000,99,sMayor);
//                Prestec p2 = new Prestec(5000,100,sMayor);
        bbva.addSucursal(sMayor);
        bbva.addSucursal(sEnMedio);

        System.out.println(bbva);

        for (Sucursal s:bbva.getSucursales()) {
            System.out.println("\t" + s);
        }
    }
}
