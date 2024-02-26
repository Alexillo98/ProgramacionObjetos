package persona;

public class Main {
    public static void main(String[] args) {

        System.out.println("Persona");


        System.out.println("\nTrabajador");
        Trabajador t = new Trabajador ("Trabajador", "C/ Enmedio");
        t.origenIngresos();
        System.out.println(t.getDireccion());

        System.out.println("\nDesempleado");
        Desempleado d = new Desempleado("Desempleado", "C Mayor");
        d.origenIngresos();
        System.out.println(d.getDireccion());

        System.out.println("\nInformatico");
        Informatico i = new Informatico("Informatico", "C/ Enmedio");
        i.origenIngresos();
        System.out.println(i.getDireccion());
        i.programar();

        System.out.println("\nPsicologo");
        Psicologo ps = new Psicologo("Psicologo.", "C / mayor");
        ps.origenIngresos();
        System.out.println(ps.getDireccion());
        ps.doyClases();
    }
}
