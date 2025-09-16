package Abstract.test;

import Abstract.dominio.Desenvolvedor;
import Abstract.dominio.Funcionario;
import Abstract.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("João", 2500, "java");
        Gerente g1 = new Gerente("Maria", 2500, "java");



        g1.calcularSalario();
        d1.calcularSalario();
        System.out.println(d1.getSalario());
        System.out.println(g1.getSalario());
    }
}
