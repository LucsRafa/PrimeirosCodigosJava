import java.util.Scanner;

public class Outrolaço {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double avaliação = 0;
        double nota = 0;
        int totalDeNotas=0;


        while (nota != -1) {

            System.out.println("Digite a Avaliação");
            nota = leitura.nextDouble();


        } if(nota != -1) {

            avaliação += nota;
            totalDeNotas++;
        }



        System.out.println("Media das avaliações é: " + avaliação / totalDeNotas);


    }

}
