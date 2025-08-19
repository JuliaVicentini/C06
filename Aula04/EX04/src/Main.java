public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 50;

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        if(zumbi1.transfereVida(zumbi2, 50)){
            System.out.println("Fazendo z1 transferir 50 para z2");
            System.out.println("Vida do zumbi z1: " + zumbi1.vida);
            System.out.println("Vida do zumbi z2: " + zumbi2.vida);
        }

        if(zumbi1.transfereVida(zumbi2, 150)){
            System.out.println("Fazendo z1 transferir 150 para z2");
            System.out.println("Vida do zumbi z1: " + zumbi1.vida);
            System.out.println("Vida do zumbi z2: " + zumbi2.vida);
        }else{
            System.out.println("A vida não foi alterada!!");
        }
    }
}