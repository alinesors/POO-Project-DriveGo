package dados.implementacoesArrayList;

import java.util.List;
import negocio.basica.modelo.Avaliacao;
import dados.Interface.IRepositorioAvaliacao;
import java.util.ArrayList;

public class RepositorioAvaliacaoArrayList implements IRepositorioAvaliacao{

    private final List<Avaliacao> avaliacoes;

    public RepositorioAvaliacaoArrayList(){
        this.avaliacoes = new ArrayList<>();
    }

    @Override
    public void inserirAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    @Override
    public List<Avaliacao> listarAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public Avaliacao buscarAvaliacao(String id) {
        for (Avaliacao avaliacao : avaliacoes) {
            if (String.valueOf(avaliacao.getId()).equals(id)) {
                return avaliacao;
            }
        }
        return null;
    }

    @Override
    public void atualizarAvaliacao(Avaliacao avaliacao) {
        for (int i = 0; i < avaliacoes.size(); i++) {
            if (avaliacoes.get(i).getId() == avaliacao.getId()) {
                avaliacoes.set(i, avaliacao);
                return;
            }
        }
    }

    @Override
    public void removerAvaliacao(Avaliacao avaliacao) {
        avaliacoes.remove(avaliacao);
    }

   


}
