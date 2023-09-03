import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.print("Digite sua nota para o file (ou digite -1 para encerrar): ");
            nota = entrada.nextDouble();

            if(nota >= 0){
                mediaNota += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Média das notas informadas: " +mediaNota/totalDeNotas);
    }
}


