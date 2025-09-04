package Static.test;

import Static.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porshe 911", 300);
        Carro carro2 = new Carro("Ferrari", 400);

        carro1.imprimir();
        carro2.imprimir();

        Carro.mudarVelocidadeLimite(300);

        carro1.imprimir();
        carro2.imprimir();
    }
}
