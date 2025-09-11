package Heranca.test;

import Heranca.dominio.Endereco;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fernando", "2142414", new Endereco("Rua Pirim", "213131"), 1300.0);

        f1.imprimir();
    }
}
