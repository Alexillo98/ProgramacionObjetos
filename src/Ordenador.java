import java.util.ArrayList;

public class Ordenador {
    public static void main(String[] args) {
        Computer o1 = new Computer(1988732,"HP","Packard-Bell25","Windows 11");
        Computer o2 = new Computer(1635245,"AOC","BK-1998","Windows 10");
        Computer o3 = new Computer(1998732,"Dell","Cyber-XX");

        ArrayList<Computer> ordenadores = new ArrayList<>();

        ordenadores.add(o1);
        ordenadores.add(o2);
        ordenadores.add(o3);

        ordenadores.forEach(System.out::println);
    }
}
