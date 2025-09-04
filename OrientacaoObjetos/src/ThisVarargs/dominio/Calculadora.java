package ThisVarargs.dominio;

public class Calculadora {

    public void somaArrays(int[] numeros){
        int soma = 0;
        for ( int i : numeros ){
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for ( int i : numeros ){
            soma += i;
        }
        System.out.println(soma);
    }



}
