import java.util.Scanner;

public class EX02{

    public static void main(String[] args) {

        //Criando um objeto do tipo Scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o valor de lanche 1: ");
        int laches1 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche 2: ");
        int laches2 = entrada.nextInt();
        System.out.print("Entre com o valor de lanche 3: ");
        int laches3 = entrada.nextInt();


        int total = laches1 + laches2 + laches3;
        double media = (double) total / 3; // casting
        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);

        entrada.close();  //Fechando o scanner

    }
}
