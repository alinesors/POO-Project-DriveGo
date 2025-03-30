package servico;

import dados.implementacoesArrayList.RepositorioCidadeArrayList

import dados.implementacoesArrayList.RepositorioCidadeArrayList;
import negocio.basica.modelo.Cidade;
import java.util.List;
import java.util.ArrayList;


public class CidadeServico {

    private IRepositorioCidade repositorioCidade;

    public CidadeServico(IRepositorioCidade repositorioCidade) {
        this.repositorioCidade = repositorioCidade;
    }

    public CidadeServico() {
        this.repositorioCidade = new RepositorioCidadeArrayList();
    }   

    public void cadastrarCidade(Cidade cidade) {
        repositorioCidade.salvarCidade(cidade); // Correct method name to match the interface
    }
    
    public List<Cidade> listarCidades() {
        return repositorioCidade.listarCidades();
    }

    public Cidade buscarCidade(String nome) {
        return repositorioCidade.buscarCidade(nome);
    }

    public void atualizarCidade(Cidade cidade) {
        repositorioCidade.atualizarCidade(cidade);
    }

    public void removerCidade(String nome) {
        repositorioCidade.removerCidade(nome);
    }

}
