public class Examples {
    public static void main (String[] args){
        //%s = chama uma string
        //%d = um numero inteiro
        //%f = numero decimal
        String nome = "Maria";
        int idade = 23;
        double valor = 23.44;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    }
}
