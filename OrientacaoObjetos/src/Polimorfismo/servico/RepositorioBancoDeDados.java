package Polimorfismo.servico;

import Polimorfismo.repository.Repository;

public class RepositorioBancoDeDados implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
