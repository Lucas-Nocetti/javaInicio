import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String inicioTexto ="""
                **********************************
                    Dados iniciais do cliente:
                
                """;
        String fimTexto = "**********************************";
        String nomeCliente = "Lucas Teste";
        String tipoDeConta = "Conta Corrente";
        double saldoCliente = 3500;
        String opcoesOperacoes ="""
                1 - Consultar Saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        int operacao = 0;
        double valorDeposito = 0;
        double valorTransferencia;

        System.out.print(inicioTexto);
        System.out.print(String.format("Nome: %s \nTipo de conta: %s \nSaldo inicial: %.2f\n\n", nomeCliente, tipoDeConta, saldoCliente));
        System.out.print(fimTexto);

        while(operacao !=4) {
            System.out.println("\n\nOperações disponíveis: \n\n" + opcoesOperacoes);
            System.out.print("Digite a opção desejada: ");
            operacao = entrada.nextInt();

            if(operacao==1){
                System.out.print("Seu saldo é: " +saldoCliente);
            } else if (operacao==2) {
                System.out.println("Qual o valor a receber?");
                valorDeposito = entrada.nextDouble();
                saldoCliente += valorDeposito;
                System.out.print("Saldo atualizado: " +saldoCliente);
            } else{
                System.out.println("Qual o valor para transferir?");
                valorTransferencia = entrada.nextDouble();
                if(valorTransferencia<=saldoCliente) {
                    saldoCliente -= valorTransferencia;
                    System.out.print("Saldo atualizado: " + saldoCliente);
                }else{
                    System.out.print("Saldo insuficiente!");
                }
            }
        }
        System.out.println("\nMuito obrigado por ser nosso cliente!");
    }
}