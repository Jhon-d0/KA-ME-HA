package Exercicios.heranca_interfaces_polimorfismo.ex1.test;

import Exercicios.heranca_interfaces_polimorfismo.ex1.dominio.Gerente;
import Exercicios.heranca_interfaces_polimorfismo.ex1.dominio.Programador;

public class FuncionaroTest {
    public static void main(String[] args) {
        Programador programador1 = new Programador("João", 5000, 10);
        Gerente gerente1 = new Gerente("Fernando", 10000, 3000);

        gerente1.calcularSalario();
        programador1.calcularSalario();
    }
}
