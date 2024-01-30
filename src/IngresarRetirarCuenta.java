public class IngresarRetirarCuenta {
    public static void main(String[] args) {
        Cuenta pepe = new Cuenta("Pepe",200);
        Cuenta maria = new Cuenta("Maria",500);

        pepe.ingresar(25);
        maria.retirar(600);
        System.out.println(pepe);
        System.out.println(maria);
    }
}
