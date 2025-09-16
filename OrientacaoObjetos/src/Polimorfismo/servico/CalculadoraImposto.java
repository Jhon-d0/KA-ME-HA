package Polimorfismo.servico;

import Polimorfismo.dominio.Computador;

public class CalculadoraImposto {
    public void calculadoraImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.Calcularimposto();
    }
}
