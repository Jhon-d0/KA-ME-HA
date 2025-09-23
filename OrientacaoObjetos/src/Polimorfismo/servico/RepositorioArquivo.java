package Polimorfismo.servico;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.repository.Repository;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RepositorioArquivo implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
