package encapsulamento00;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
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
        p3.setIdade(7);
        p3.setAltura(1.15);
        p3.setTelefone(0L);
        p3.setEmail("duduexample.com");
        p3.setCpf(123456789L);

        System.out.println("\n==================================\n");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Telefone: " + p1.getTelefone());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("CPF: " + p1.getCpf());

        System.out.println("\n==================================\n");

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Altura: " + p2.getAltura());
        System.out.println("Telefone: " + p2.getTelefone());
        System.out.println("Email: " + p2.getEmail());
        System.out.println("CPF: " + p2.getCpf());

        System.out.println("\n==================================\n");

        System.out.println("Nome: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());
        System.out.println("Altura: " + p3.getAltura());
        System.out.println("Telefone: " + p3.getTelefone());
        System.out.println("Email: " + p3.getEmail());
        System.out.println("CPF: " + p3.getCpf());

        System.out.println("\n==================================\n");

    }



}
