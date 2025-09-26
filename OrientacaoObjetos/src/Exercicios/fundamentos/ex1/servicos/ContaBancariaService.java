package Exercicios.fundamentos.ex1.servicos;

import Exercicios.fundamentos.ex1.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaService {

    public static void depositar(ContaBancaria contaBancaria) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor a ser depositado: ");
        double valorDoDeposito = input.nextDouble();
        System.out.println("Depositando " + valorDoDeposito + " na conta Bancaria");
        contaBancaria.setSaldo(contaBancaria.getSaldo() + valorDoDeposito);
        System.out.println("O valor " + valorDoDeposito + " foi depositado com sucesso");
    }

    public static void sacar(ContaBancaria contaBancaria) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado: ");
        double valorSacar = input.nextDouble();
        System.out.println("Sacando " +  valorSacar + " da conta Bancaria");

        if (contaBancaria.getSaldo() < valorSacar) {
            System.out.println("Saldo insuficiente");
            return;
        }

        contaBancaria.setSaldo(contaBancaria.getSaldo() - valorSacar);
        System.out.println("Saque concluido com sucesso");
    }

    public static void consultandoSaldo(ContaBancaria contaBancaria) {
        System.out.println("Consultando saldo da conta Bancaria");
        System.out.println("Saldo: " + contaBancaria.getSaldo());
    }

}
