public class Condicional {

    public static void main(String[] args) {
        int anoLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento>=2014){
            System.out.println("O filme é recente, foi lançado no ano de " +anoLancamento);
        }else{
            System.out.println("Filme antigo, porém muito bom!");
        }

        if (incluidoNoPlano == false || tipoPlano.equals("plus")){
            System.out.println("O filme está incluido no seu plano!");
        }else{
            System.out.println("Para assistir o filme, você precisa fazer o upgrade de seu plano!");
        }
    }
}
