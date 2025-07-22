package encapsulamento00;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private long telefone;
    private String email;
    private long cpf;

    // Getter do nome
    public String getNome() {
        if (nome != null && nome.toLowerCase().contains("a")) {
            System.out.println("Nome inválido (contém a letra 'a').");
            return null;
        }
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter da idade
    public int getIdade() {
        return idade;
    }

    // Setter da idade
    public void setIdade(int idade) {
        if (idade >= 25) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida (menor que 25).");
        }
    }

    // Getter da altura
    public double getAltura() {
        return altura;
    }

    // Setter da altura
    public void setAltura(double altura) {
        if (altura >= 1.60) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida (menor que 1.60).");
        }
    }

    // Getter do telefone
    public long getTelefone() {
        return telefone;
    }

    // Setter do telefone
    public void setTelefone(long telefone) {
        if (telefone >= 11) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido.");
        }
    }

    // Getter do email
    public String getEmail() {
        return email;
    }

    // Setter do email
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }
    }

    // Getter do CPF
    public long getCpf() {
        return cpf;
    }

    // Setter do CPF
    public void setCpf(long cpf) {
        if (cpf >= 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve conter 11 dígitos.");
        }
    }

}


