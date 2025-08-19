public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        personagem1.nome = "Jogador1";
        personagem2.nome = "Jogador2";
        personagem1.pontos = 100;
        personagem2.pontos = 80;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();
        arma1.nome = "Revolver 1";
        arma2.nome = "Revolver 2";
        arma1.poder = 5;
        arma2.poder = 5;
        arma1.resistencia = 100;
        arma2.resistencia = 100;
        arma1.descricao = "Arma do jogador 1";
        arma2.descricao = "Arma do jogador 2";

        arma1.mostraInfoArma();
        personagem1.tomarDano();
        System.out.println(personagem1.pontos);
        arma2.mostraInfoArma();
        personagem2.tomarDano();
        System.out.println(personagem2.pontos);
    }
}