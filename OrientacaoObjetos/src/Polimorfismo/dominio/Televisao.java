package Polimorfismo.dominio;

public class Televisao extends Produto{

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double Calcularimposto() {
        return this.getValor() * 0.2;
    }

    @Override
    public void Test() {

    }
}
