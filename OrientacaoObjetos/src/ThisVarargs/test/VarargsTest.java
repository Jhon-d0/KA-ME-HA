package ThisVarargs.test;

import ThisVarargs.dominio.Calculadora;

public class VarargsTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] array1 = {1, 2, 3, 4, 5};

        calculadora.somaArrays(array1);

        calculadora.somaVarArgs(1, 2, 3, 4, 5, 10);
    }
}
