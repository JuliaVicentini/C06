import java.util.Random;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x;
        int numGerado = rand.nextInt(10) + 1;

        do{
            System.out.println("Adivinhe o número");
            x = entrada.nextInt();
            if(x != numGerado){
                System.out.println("Errou");
            }
        } while(x != numGerado);

        System.out.println("Acertou");

        entrada.close();
    }
}