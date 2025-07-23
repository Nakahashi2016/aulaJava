package veiculosP;

public class Main {
    public static void main(String[] args) {
        projVeiculos.Veiculo A = new projVeiculos.Veiculo("Honda", "Biz");
        projVeiculos.Carro B = new projVeiculos.Carro("Toyota", "Corolla", 4, 2);
        projVeiculos.Moto C = new projVeiculos.Moto("Honda", "Hornet", 1, 6);

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

Você pode usar o main na classe aula05 e na classe Main porque cada classe pode ter seu próprio método main,
que é o ponto de entrada para o programa. Como as classes Veiculo, Carro e Moto são internas eestáticas
dentro de aula05, você pode criar objetos delas de fora, como na classe Main. Assim, dá para rodar
o programa a partir de qualqueruma das duas classes com main.

*/









