import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome de seu filme favorito: ");
        String filme = entrada.nextLine();

        System.out.print("Quando ele foi lançado? ");
        int dataFilme = entrada.nextInt();

        System.out.print("Qual nota você dá para ele? ");
        double notaFilme = entrada.nextDouble();

        System.out.println("Seu filme favorito é: " +filme);
        System.out.println("Lançado em: " +dataFilme);
        System.out.println("Nota: " +notaFilme);

    }
}
