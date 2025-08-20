package IFandELSE;

public class ifandelse {
    public static void main(String[] args) {
        boolean condicao = false;
        if (condicao == false) {
            System.out.println("Condicao");
        }else {
            System.out.println("verdadeiro");
        }


        int idade = 17;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }


    }
}
