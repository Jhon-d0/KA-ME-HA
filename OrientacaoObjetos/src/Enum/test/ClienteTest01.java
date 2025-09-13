package Enum.test;

import Enum.dominio.Cliente;
import Enum.dominio.TipoCliente;
import Enum.dominio.TipoDePagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Eren", TipoCliente.PESSOA_FISICA, Cliente.Genero.MASCULNO, TipoDePagamento.AVISTA);
        Cliente c2 = new Cliente("Levi", TipoCliente.PESSOA_JURIDICA, Cliente.Genero.MASCULNO, TipoDePagamento.CREDITO);
        Cliente c3 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, Cliente.Genero.FEMININO, TipoDePagamento.DEBITO);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
