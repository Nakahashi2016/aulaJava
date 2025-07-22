package encapsulamento01;

public class Main1 {
    public static void main(String[] args) {

        // Criação de objetos Pessoa1
        Pessoa1 p1 = new Pessoa1("Ana", 25, 1.67, 11593852038L, "ana@exemplo.com", 12345678901L);
        Pessoa1 p2 = new Pessoa1("Luis", 27, 1.78, 11305836560L, "Luis@exemplo.com", 98765432100L);
        Pessoa1 p3 = new Pessoa1("Dudu", 7, 1.15, 0L, "", 54256674859L);

        // Chamada dos metodos
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}