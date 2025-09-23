package Polimorfismo.servico;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;

import java.util.function.ToDoubleBiFunction;

public class CalculadoraImposto {

    public static void calcularImpostoDoProduto(Produto produto){
        System.out.println("Calculando Imposto de: " + produto.getNome());

        double imposto = produto.Calcularimposto();

        System.out.println("Imposto: " + imposto);

        if(produto instanceof Tomate){
            System.out.println("A data de validade é: " + ((Tomate) produto).getDataValidade());
        } else if (produto instanceof Computador) {
            System.out.println("O processador é: " + (((Computador) produto).getProcessador()));
        }
    }

}
