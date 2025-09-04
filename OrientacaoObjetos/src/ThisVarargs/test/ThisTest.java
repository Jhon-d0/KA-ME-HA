package ThisVarargs.test;

import ThisVarargs.dominio.Pessoa;

public class ThisTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcio Greide", 50);
        Pessoa p2 = new Pessoa("Cristina", 34);

        p1.imprimirPessoa();
        p2.imprimirPessoa();

    }
}
