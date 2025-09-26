package Polimorfismo.dominio;

public class Computador extends Produto{
    private String processador;



    public Computador(String nome, double valor, String processador) {
        super(nome, valor);
        this.processador = processador;
    }

    @Override
    public double Calcularimposto() {
        return this.getValor() * 0.05;
    }

    @Override
    public void Test() {

    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
