package ModificadorFinal.test;

import ModificadorFinal.dominio.Carro;
import ModificadorFinal.dominio.Comprador;
import ModificadorFinal.dominio.Ferrari;
import ModificadorFinal.dominio.Vendedor;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Porshe 911 GT3");
        Comprador comprador2 = new Comprador("Alberto");
        Ferrari ferrari= new Ferrari("Ferrari", "ABD34");
        ferrari.vendedor = new Vendedor("Rio Grande");

//        c1.COMPRADOR = comprador2;  Não da pra modificar o objeto apenas o atributo dentro dele ao usar o final
        System.out.println("O comprador é: " + c1.COMPRADOR.getNome());
        c1.COMPRADOR.setNome(comprador2.getNome());
        System.out.println("O comprador é: " + c1.COMPRADOR.getNome());

        System.out.println("-------------------------");

        c1.imprimir();

        System.out.println("-------------------------");

        ferrari.imprimir();

    }
}
