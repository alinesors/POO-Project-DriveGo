package servico;
import dados.Interface.IRepositorioAvaliacao;
import dados.implementacoesArrayList.RepositorioAvaliacaoArrayList;
import negocio.basica.modelo.Avaliacao;
import java.util.List;
import java.util.ArrayList;

public class AvaliacaoServico {

    private IRepositorioAvaliacao repositorioAvaliacao;

    public AvaliacaoServico(IRepositorioAvaliacao repositorioAvaliacao) {
        this.repositorioAvaliacao = repositorioAvaliacao;
    }

    public AvaliacaoServico() {
        this.repositorioAvaliacao = new RepositorioAvaliacaoArrayList();
    }

    public void cadastrarAvaliacao(Avaliacao avaliacao) {
        repositorioAvaliacao.inserirAvaliacao(avaliacao);
    }

    public List<Avaliacao> listarAvaliacoes() {
        return repositorioAvaliacao.listarAvaliacoes();
    }

    public Avaliacao buscarAvaliacao(String id) {
        return repositorioAvaliacao.buscarAvaliacao(id);
    }

    public void atualizarAvaliacao(Avaliacao avaliacao) {
        repositorioAvaliacao.atualizarAvaliacao(avaliacao);
    }

    public void removerAvaliacao(String id) {
        repositorioAvaliacao.removerAvaliacao(id);
    }

}
