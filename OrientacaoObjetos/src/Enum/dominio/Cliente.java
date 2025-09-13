package Enum.dominio;

import Exercicios.ex3.Sexo;

public class Cliente {

    public enum Genero{
        MASCULNO("Mascuino"),
        FEMININO("Feminino");

        public String sexo;

        Genero(String sexo) {
            this.sexo = sexo;
        }

        @Override
        public String toString() {
            return sexo;
        }
    }

    private String nome;
    private TipoCliente tipoCliente;
    private Genero genero;
    private TipoDePagamento tipoDePagamento;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, Genero genero, TipoDePagamento tipoDePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.genero = genero;
        this.tipoDePagamento = tipoDePagamento;
    }

    @Override
    public String toString() {
        return nome + " " + tipoCliente.pessoa + " " + tipoCliente.valor + " " + this.genero + " " + tipoDePagamento.CalcularDesconto(100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public TipoDePagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }
}
