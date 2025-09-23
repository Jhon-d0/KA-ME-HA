package Polimorfismo.test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Accer 5", 3500, "5r");
        Computador c1 = new Computador("Computador 1", 5000, "kg");
        Produto prodto02 = new Tomate("Alessandro", 20);
        Televisao tv01 = new Televisao("Samsung 50\"", 6000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(c1.getProcessador());

        System.out.println("--------------");

        System.out.println(prodto02.getNome());
        System.out.println(prodto02.getValor());
        CalculadoraImposto.calcularImpostoDoProduto(prodto02);

        System.out.println("--------------");

        CalculadoraImposto.calcularImpostoDoProduto(tv01);
    }
}
