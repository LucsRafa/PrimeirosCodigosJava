import java.util.Scanner;

public class LLeitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um filme");
            String filme = leitura.nextLine();
        System.out.println("Digite a data");
            int dataDeLancamento = leitura.nextInt();
        System.out.println("Digite a Avaliação");
            double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(dataDeLancamento);
        System.out.println(avaliação);
    }

}
