public class Main{
    public static void main(String args[]){

        Kart kart1 = new Kart();
        kart1.nome = "Kart1";
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 90;

        Kart kart2 = new Kart();
        kart2.nome = "Kart2";
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 80;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Piloto1";
        piloto2.nome = "Piloto2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();
        kart1.fazerDrift();
        kart1.motor.mostraInfo();
        kart2.soltarTurbo();
        kart2.motor.mostraInfo();
        
    }
}