package OperadorTernario;

public class Ternario {
    public static void main(String[] args) {

        int idadeDeKleber = 18;
        int idadeDeJoao = 19;


        String Maior = idadeDeJoao > idadeDeKleber ? "João" : "Kleber";
        System.out.println(Maior);


//        Em ternario, quero saber a categoria de alguem pela idade


        int idade = 50;
        String categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : idade >= 18 && idade < 50 ? "Categoria Adulta" : "Categoria Idosa";

        System.out.println(categoria);

    }
}
