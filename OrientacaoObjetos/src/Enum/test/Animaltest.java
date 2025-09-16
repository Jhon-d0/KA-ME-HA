package Enum.test;

import Enum.dominio.Animal;
import Enum.dominio.Tipodealimentacao;

public class Animaltest {
    public static void main(String[] args) {

        Animal Leao = new Animal("Lion", Tipodealimentacao.CARNIVORO);

        System.out.println(Tipodealimentacao.procurandotipo("Vegetariano"));

    }
}
