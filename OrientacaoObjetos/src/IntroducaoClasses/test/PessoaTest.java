package IntroducaoClasses.test;

import IntroducaoClasses.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Albert Einstein", 63);
        Pessoa p2 = new Pessoa("Silvio Santos", 50);

        System.out.println("Eu tenho 2 pessoas usando a mesma classe porque tem os mesmo atributos são elas: \n" + p1.nome + " Com " + p1.idade + " De idade \n" + p2.nome + " Com " + p2.idade + " De idade \n");
    }
}
