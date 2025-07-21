package encapsulamento01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private long telefone;
    private String email;
    private long cpf;

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 25) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida (menor que 25).");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        if (altura >= 1.60) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida (menor que 1.60).");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setTelefone(long telefone) {
        if (String.valueOf(telefone).length() == 11) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido (deve conter 11 dígitos).");
        }
    }

    public long getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setCpf(long cpf) {
        if (String.valueOf(cpf).length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido (deve conter 11 dígitos).");
        }
    }

    public long getCpf() {
        return cpf;
    }

    // Método para exibir os dados organizadamente
    public void exibir() {
        System.out.println("==================================");
        System.out.println(">>> DADOS DA PESSOA <<<");

        System.out.println("Nome    : " + (nome != null ? nome : "Inválido"));
        System.out.println("Idade   : " + (idade >= 25 ? idade : "Inválida"));
        System.out.println("Altura  : " + (altura >= 1.60 ? altura : "Inválida"));
        System.out.println("Telefone: " + (String.valueOf(telefone).length() == 11 ? telefone : "Inválido"));
        System.out.println("Email   : " + (email != null && email.contains("@") && email.contains(".") ? email : "Inválido"));
        System.out.println("CPF     : " + (String.valueOf(cpf).length() == 11 ? cpf : "Inválido"));
        System.out.println("==================================\n");
    }
}
