package Exercicios.fundamentos.ex1.test;

import Exercicios.fundamentos.ex1.dominio.ContaBancaria;
import Exercicios.fundamentos.ex1.servicos.ContaBancariaService;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("1042", "Luisa", 500);

        ContaBancariaService.depositar(conta1);

        System.out.println("----------------------------------------------");

        ContaBancariaService.sacar(conta1);

        System.out.println("----------------------------------------------");

        ContaBancariaService.consultandoSaldo(conta1);
    }
}
