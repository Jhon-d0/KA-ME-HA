package introducaoMetodos.test;

import IntroducaoClasses.dominio.Pessoa;
import introducaoMetodos.dominios.MetodoDouble;
import introducaoMetodos.dominios.Metodos;

public class MetodoTest {
    public static void main(String[] args) {
        Metodos m1 = new Metodos();
        MetodoDouble m2 = new MetodoDouble();
        Pessoa p1 = new Pessoa("joao", 15);
        Pessoa p2 = new Pessoa("Luisa", 16);



        m1.metodo1();

        System.out.println("----------");

        m1.metodo2();

        System.out.println("----------");

        m1.metodo3(20, 30);

        System.out.println("----------------");

        double result = m2.metodoDouble1();

        System.out.println(result);

        System.out.println("------------");

        System.out.println(m2.metodoDouble2(5, 6));

        System.out.println("------------");

        m1.imprimapessoa(p1);
        m1.imprimapessoa(p2);



    }
}
