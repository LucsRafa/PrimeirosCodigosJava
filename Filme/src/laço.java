import java.util.Scanner;

public class laço {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double avaliação = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a Avaliação");
                nota = leitura.nextDouble();
            avaliação += nota;
        }



        System.out.println("Media das avaliações é: " + avaliação/3);

    }


}
