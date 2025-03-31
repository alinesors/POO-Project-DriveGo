package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;
import negocio.basica.modelo.Avaliacao;

public class RepositorioAvaliacaoArrayList {

    private List<Avaliacao> avaliacoes;

    public RepositorioAvaliacaoArrayList() {
        this.avaliacoes = new ArrayList<>();
    }

    public RepositorioAvaliacaoArrayList(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void SalvarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public Avaliacao buscarAvaliacao(String id) {
       
        return null;
    }

    public List<Avaliacao> listarAvaliacoes() {
        return avaliacoes;
    }

    public void atualizarAvaliacao(Avaliacao avaliacao) {
      
    }

    public void removerAvaliacao(String id) {
       
    }

    public void removerAvaliacao(Avaliacao avaliacao) {
        avaliacoes.remove(avaliacao);
    }


}
