package encapsulamento02;

public class Pessoa2 {

    // Atributos privados (encapsulamento)
    private String nome;
    private int idade;
    private double altura;
    private long telefone;
    private String email;
    private long cpf;

    // Construtor
    public Pessoa2(String nome, int idade, double altura, long telefone, String email, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }


    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public long getCpf() {
        return cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    // Metodo para exibir os dados
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



