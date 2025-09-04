package introducaoMetodos.dominios;

import IntroducaoClasses.dominio.Pessoa;

public class Metodos {
    public  void metodo1(){
        System.out.println("Metodo 1: \nSoma de 10 mais 10 = " + (10 + 10));
    }

    public  void metodo2(){
        System.out.println("Esse é o metodo 2 e ele so escreve :)");
    }

    public  void metodo3(int n1, int n2){
        int soma = n1+n2;
        System.out.println("A soma dos numeros são: " + soma);
    }

    public void imprimapessoa (Pessoa pessoa){
        System.out.println("---------Metodo imprimir pessoa--------");

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        return;
    }
}
