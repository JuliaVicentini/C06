public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        zumbi1 = zumbi2;

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}
