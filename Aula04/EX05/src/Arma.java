public class Arma {
    String nome;
    String descricao;
    int poder;
    int resistencia;

    void mostraInfoArma(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Poder: " + poder);
    }
}