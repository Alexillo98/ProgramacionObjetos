package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco(111,"Santander",new HashSet<>());
            Sucursal mayor = new Sucursal(1,"c/ Mayor",santander,new HashSet<>(),new HashSet<>());
                santander.addSucursal(mayor);
                Cliente maria = new Cliente("123456X","Maria",new HashSet<>(),new HashSet<>());
                    Prestamo p1 = new Prestamo(10,12000,mayor,maria);
                        maria.addPrestamo(p1);
                        mayor.addPrestamo(p1);
                            CuentaCorriente cc1 = new CuentaCorriente(11,1500,mayor,new HashSet<>(),new HashSet<>());
                                maria.addCuentaCorriente(cc1);
                                mayor.addCuentaCorriente(cc1);
                                    Domiciliacion dom1 = new Domiciliacion(30,cc1);
                                        cc1.addDomiciliacion(dom1);
        Banco cajamar = new Banco(222,"Cajamar",new HashSet<>());
            Sucursal herrero = new Sucursal(2,"c/ Herrero",cajamar,new HashSet<>(),new HashSet<>());
                cajamar.addSucursal(herrero);
                Cliente paco = new Cliente("987654Y","Paco",new HashSet<>(),new HashSet<>());
                    Prestamo p2 = new Prestamo(20,6000,herrero,paco);
                        paco.addPrestamo(p2);
                        herrero.addPrestamo(p2);
                            CuentaCorriente cc2 = new CuentaCorriente(21,2500,herrero,new HashSet<>(),new HashSet<>());
                                paco.addCuentaCorriente(cc2);
                                herrero.addCuentaCorriente(cc2);
                                    Domiciliacion dom2 = new Domiciliacion(40,cc2);
                                        cc2.addDomiciliacion(dom2);

        List<Banco> l = new ArrayList<>();
        l.add(santander);
        l.add(cajamar);
        for (Banco b : l) {
            System.out.println(b);
            for (Sucursal s: b.getSucursales()){
                System.out.println("\t" + s);
                for (Prestamo p: s.getPrestamos()) {
                    System.out.println("\t\t" + p);
                    System.out.println("\t\t\t" + s.getCuentasCorrientes());
                }
            }
        }
    }
}
