package Associacao.dominio;

import javax.print.attribute.standard.JobMessageFromOperator;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir() {

        System.out.println("------" + this.nome.toUpperCase() + "--------");
        if (jogadores == null) return;
        int i = 0;
        for (Jogador jogador : jogadores) {
            i += 1;
            System.out.println("Jogador " + i + ": " + jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
