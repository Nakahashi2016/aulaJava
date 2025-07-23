package veiculosP;

    public class projVeiculos {

        static class Veiculo {
            String marca, modelo;

            Veiculo(String marca, String modelo) {
                this.marca = marca;
                this.modelo = modelo;
            }

            void exibirDados() {
                System.out.println("Um veículo " + marca + " " + modelo + ".");
            }
        }


        static class Carro extends Veiculo {
            int portas;
            int espelhos;

            Carro(String marca, String modelo, int portas, int espelhos) {
                super(marca, modelo);
                this.portas = portas;
                this.espelhos = espelhos;
            }

            @Override
            void exibirDados() {
                System.out.println("Um carro de marca " + marca + " " + modelo + " com " + portas + " portas e " + espelhos + " espelhos.");
            }
        }


        static class Moto extends Veiculo {
            int assentos;
            int marchas;

            Moto(String marca, String modelo, int assentos, int marchas) {
                super(marca, modelo);
                this.assentos = assentos;
                this.marchas = marchas;
            }

            @Override
            void exibirDados() {
                System.out.println("Uma moto de marca " + marca + " " + modelo + " com " + assentos + " assentos e " + marchas + " marchas.");
            }
        }


        public static void main(String[] args) {
            projVeiculos.Veiculo A = new projVeiculos.Veiculo("Honda", "Biz");
            projVeiculos.Carro B = new projVeiculos.Carro("Toyota", "Corolla", 4, 2);
            projVeiculos.Moto C = new projVeiculos.Moto("Honda", "Hornet", 1, 6);

            A.exibirDados();
            B.exibirDados();
            C.exibirDados();
        }

    }



