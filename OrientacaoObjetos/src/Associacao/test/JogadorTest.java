package Associacao.test;

import Associacao.dominio.Jogador;
import Associacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {

        Time brasil = new Time("Brasil");
        Time argentina = new Time("Argentina");

        Jogador j1 = new Jogador("Pelé", brasil);
        Jogador j2 = new Jogador("Neymar", brasil);
        Jogador j3 = new Jogador("Dimaria", argentina);
        Jogador j4 = new Jogador("Messi", argentina);

        Jogador[] jogadoresDoBrasil = {j1, j2};
        Jogador[] jogadoresDoArgentina = {j3, j4};

        brasil.setJogadores(jogadoresDoBrasil);
        argentina.setJogadores(jogadoresDoArgentina);


        brasil.imprimir();
        argentina.imprimir();
    }
}
