package ModificadorFinal.test;

import ModificadorFinal.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Porshe 911 GT3");

        System.out.println(c1.toString());
        System.out.println(Carro.getVelocidadelimite());


    }
}
