package encapsulamento02;

public class Main2 {
    public static void main(String[] args) {

        // Criação de objetos Pessoa2
        Pessoa2 p1 = new Pessoa2("Ana", 25, 1.67, 11593820380L, "ana@exemplo.com", 12345608901L);
        Pessoa2 p2 = new Pessoa2("Luis", 27, 1.78, 11305865600L, "Luis@exemplo.com", 98760432100L);

        System.out.println("\n======================================");

        // Exibindo dados originais
        System.out.println("\nDados originais:\n");
        p1.exibirDados();
        p2.exibirDados();

        // Atualizaondo informações
        p1.setEmail("ana.nova@exemplo.com");
        p1.setTelefone(12942783256L);
        p1.setCpf(87356825782L);

        // Exibindo dados após as alterações
        System.out.println("Dados atualizados:");
        p1.exibirDados();
        p2.exibirDados();
    }
}
