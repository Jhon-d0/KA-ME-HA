package Polimorfismo.test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Accer 7", 7000, "4t");
        Tomate tomate01 = new Tomate("Tomate vermelhão", 30, "12/42/5252");

        tomate01.setDataValidade("12/12/2025");

        CalculadoraImposto.calcularImpostoDoProduto(tomate01);

        System.out.println("------------------------------------");

        CalculadoraImposto.calcularImpostoDoProduto(produto);
    }
}
