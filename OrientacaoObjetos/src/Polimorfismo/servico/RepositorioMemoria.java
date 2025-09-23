package Polimorfismo.servico;

import Polimorfismo.repository.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
