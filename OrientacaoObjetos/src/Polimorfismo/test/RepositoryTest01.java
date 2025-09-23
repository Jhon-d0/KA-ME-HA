package Polimorfismo.test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Taxavel;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.repository.Repository;
import Polimorfismo.servico.RepositorioArquivo;
import Polimorfismo.servico.RepositorioBancoDeDados;
import Polimorfismo.servico.RepositorioMemoria;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositorioMemoria();

        repository.salvar();
    }
}
