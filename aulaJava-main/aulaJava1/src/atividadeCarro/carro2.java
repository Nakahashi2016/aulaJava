package atividadeCarro;
public class Carro2 {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1980;

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
    }
}