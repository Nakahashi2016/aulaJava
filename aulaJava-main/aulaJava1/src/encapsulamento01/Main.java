package encapsulamento01;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana"); // Contém 'a', mas agora isso não invalida o nome
        p1.setIdade(25);
        p1.setAltura(1.67);
        p1.setTelefone(11593852038L);
        p1.setEmail("ana@example.com");
        p1.setCpf(12345678901L);

        Pessoa p2 = new Pessoa();
        p2.setNome("Minoru");
        p2.setIdade(25);
        p2.setAltura(1.78);
        p2.setTelefone(11305836560L);
        p2.setEmail("minoru@example.com");
        p2.setCpf(98765432100L);

        Pessoa p3 = new Pessoa();
        p3.setNome("Dudu");
        p3.setIdade(7); // inválido
        p3.setAltura(1.15); // inválido
        p3.setTelefone(0L); // inválido
        p3.setEmail("duduexample.com"); // inválido
        p3.setCpf(123456789L); // inválido

        // Exibindo organizadamente
        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
