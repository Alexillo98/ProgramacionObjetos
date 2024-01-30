import java.util.Scanner;

public class AireAcondicionado {

//    private static int f(){
//        int a = 1;
//        return a++;
//    }
    public static void main(String[] args) {

//        System.out.println(f());
        Scanner escaner = new Scanner(System.in);

        String boton;

        AirConditioning aire1 = new AirConditioning("Philips",29,15,30);
        AirConditioning aire2 = new AirConditioning("Mitsubishi",18,17,35);

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
