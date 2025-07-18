package aula00;

public class Main {
    public static void main(String[] args) {
        aula05.Veiculo A = new aula05.Veiculo("Honda", "Biz");
        aula05.Carro B = new aula05.Carro("Toyota", "Corolla", 4, 2);
        aula05.Moto C = new aula05.Moto("Honda", "Hornet", 1, 6);

        A.exibirDados();
        B.exibirDados();
        C.exibirDados();
    }
}


/*

Duas classes com métodos main no mesmo pacote	                    ✅ Sim	    Nomes diferentes
Acessar classes internas static de outra classe no mesmo pacote	    ✅ Sim	    Classes são static e não são private
Ter duas classes chamadas Main no mesmo pacote                      ❌ Não	    Conflito de nome no mesmo namespace
Ter duas classes chamadas Main em pacotes diferentes	            ✅ Sim	    Pacotes diferentes isolam os nomes

*/









