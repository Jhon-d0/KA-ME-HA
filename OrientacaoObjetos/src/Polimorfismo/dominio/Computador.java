package Polimorfismo.dominio;

public class Computador extends Produto{


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double Calcularimposto() {
        return 0;
    }
}
