import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite sua nota para o file: ");
            nota = entrada.nextDouble();
            mediaNota += nota;

        }
        System.out.println("Média das notas informadas: " +mediaNota/3);
    }
}