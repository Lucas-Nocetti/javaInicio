public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " +anoLancamento);
        boolean incluidoNoPlano = true;

        double notaFilme = 8.1;
        System.out.println("Nota IMDb: " +notaFilme);

        String sinopse;
        sinopse = """
                Sinopse:
                Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, Pete "Maverick" Mitchell está de volta,
                rompendo os limites como um piloto de testes corajoso. No mundo contemporâneo das guerras tecnológicas,
                Maverick enfrenta drones e prova que o fator humano ainda é essencial.
                """;
        System.out.println(sinopse);

    }
}