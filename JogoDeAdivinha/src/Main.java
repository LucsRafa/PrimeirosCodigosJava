import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(2);
        int numeroDeVezes = 0;
        int numeroDigitado =0;

        System.out.println("Bem vindo");
        System.out.println("Jogo de adivinha");

        while (numeroDeVezes < 5) {
            System.out.println("Digite um numero de 0 a 100: ");
            numeroDigitado = receba.nextInt();
            numeroDeVezes++;

        }
        if ( numeroDigitado == numeroGerado) {
            System.out.println("Parabéns, você acertou o número em " + numeroDeVezes + " tentativas!");

        } else if (numeroDigitado > numeroGerado) {
            System.out.println("O numero digitado é maior");

        } else {
            System.out.println("O numero digitado é menor");
        }

        if (numeroDeVezes == numeroGerado) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);


        }

    }
}