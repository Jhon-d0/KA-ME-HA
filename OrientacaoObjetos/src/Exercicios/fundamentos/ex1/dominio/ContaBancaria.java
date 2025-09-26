package Exercicios.fundamentos.ex1.dominio;

public class ContaBancaria {
    private String nummeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String nummeroDaConta, String titular, double saldo) {
        this.nummeroDaConta = nummeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNummeroDaConta() {
        return nummeroDaConta;
    }

    public void setNummeroDaConta(String nummeroDaConta) {
        this.nummeroDaConta = nummeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
