package Polimorfismo.dominio;

public class Tomate extends Produto {
    private String dataValidade;

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double Calcularimposto() {
        return this.getValor() * 0.02;
    }

    @Override
    public void Test() {

    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}