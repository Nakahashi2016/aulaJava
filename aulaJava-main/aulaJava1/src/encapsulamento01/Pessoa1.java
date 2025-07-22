package encapsulamento01;

public class Pessoa1 {

    // Atributos privados (encapsulamento)
    private String nome;
    private int idade;
    private double altura;
    private long telefone;
    private String email;
    private long cpf;

    // Construtor
    public Pessoa1(String nome, int idade, double altura, long telefone, String email, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    // Metodo público para exibir os dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("\n======================================\n");
    }
}


