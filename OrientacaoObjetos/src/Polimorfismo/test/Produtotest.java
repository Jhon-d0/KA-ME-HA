package Polimorfismo.test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class Produtotest {
    public static void main(String[] args) {

        Computador computador01 = new Computador("Accer", 3000, "4f");
        Tomate tomate01 = new Tomate("Tomate Luisa", 25, "12/32/2333");


        CalculadoraImposto.calcularImpostoDoProduto(computador01);
        CalculadoraImposto.calcularImpostoDoProduto(tomate01);
    }
}
