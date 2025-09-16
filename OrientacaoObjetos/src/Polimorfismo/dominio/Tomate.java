package Polimorfismo.dominio;

public class Tomate extends Produto {


    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double Calcularimposto() {
        return 0;
    }
}