package Associacao.test;

import Associacao.dominio.Escola;
import Associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor p = new Professor("Kakashi Sensei");
        Professor p2 = new Professor("Luisa Sensei");
        Professor [] professores = {p, p2};
        Escola e1 = new Escola("DejaVu", professores);

        e1.imprimir();

    }
}
