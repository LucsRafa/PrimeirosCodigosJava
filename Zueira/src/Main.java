import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);

        System.out.println("Digite seu nome para eu estar uma coisa: ");
        String receptor = nome.nextLine();

        if (receptor.equals( "Lucas") || receptor.equals("lucas")){
            System.out.printf(receptor + " não é nome de gay Bro");
        } else {
            System.out.println("Isso é nome de gay");
        }
    }
}