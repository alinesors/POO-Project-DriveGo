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
        for (Avaliacao avaliacao : avaliacoes) {
            if (avaliacao.getId().equalsIgnoreCase(id)) {
                return avaliacao;
            }
        }
        return null;
    }

    public List<Avaliacao> listarAvaliacoes() {
        return avaliacoes;
    }

    public void atualizarAvaliacao(Avaliacao avaliacao) {
        for (int i = 0; i < avaliacoes.size(); i++) {
            if (avaliacoes.get(i).getId().equalsIgnoreCase(avaliacao.getId())) {
                avaliacoes.set(i, avaliacao);
                return;
            }
        }
    }

    public void removerAvaliacao(String id) {
        avaliacoes.removeIf(a -> a.getId().equalsIgnoreCase(id));
    }

    public void removerAvaliacao(Avaliacao avaliacao) {
        avaliacoes.remove(avaliacao);
    }


}
