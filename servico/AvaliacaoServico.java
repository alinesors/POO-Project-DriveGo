package servico;
import dados.Interface.IRepositorioAvaliacao;
import java.util.List;
import negocio.basica.modelo.Avaliacao;

public class AvaliacaoServico {

    private IRepositorioAvaliacao repositorioAvaliacao;

    public AvaliacaoServico(IRepositorioAvaliacao repositorioAvaliacao) {
        this.repositorioAvaliacao = repositorioAvaliacao;
    }

    public AvaliacaoServico() {
       
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

    public void removerAvaliacao(Avaliacao avaliacao) {
        repositorioAvaliacao.removerAvaliacao(avaliacao);
    }

}
