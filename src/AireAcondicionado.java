import java.util.Scanner;

public class AireAcondicionado {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        String boton;

        AirConditioning aire1 = new AirConditioning("Philips",29,15,30);

        System.out.println(aire1);

        do{
            System.out.println("Que hace el boton? (+ = Aumentar temperatura/ - = Disminuir temperatura)");
            boton = escaner.nextLine();
            switch (boton){
                case "+":
                    aire1.aumentar();
                    break;
                case "-":
                    aire1.dismuir();
                    break;
            }
            System.out.println(aire1);
        }while (!boton.isEmpty());
    }
}
