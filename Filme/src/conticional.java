public class conticional {
    public static void main(String[] args) {

        boolean incluidoNoPlano = true;
        int ano = 1988;
        double nota = 8.4;
        String tipoDoPlano = "Normal";

        if (ano >= 2022) {
            System.out.println("Filme atual!");
        } else {
            System.out.println("Filme velho!");
        }

        if ( incluidoNoPlano == true || tipoDoPlano.equals("plus")) {
            System.out.println("acesso permitido");
        } else {
            System.out.println("acesso negado");
        }

    }
}
