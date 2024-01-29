public class IngresarRetirarCuenta {
    public static void main(String[] args) {
        Cuenta pepe = new Cuenta("Pepe",200);

        pepe.ingresar(-1);

        System.out.println(pepe);
    }
}
