public class Personas {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace","24 Maddox St. London W1S 2QN");
        Person javier = new Person("Javier García");
        javier.setAdress("Calle Mayor");
        System.out.println(ada);
        System.out.println(javier);
    }
}
