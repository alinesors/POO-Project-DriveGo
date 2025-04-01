package dados.Interface;

import java.util.List;

import negocio.basica.modelo.Avaliacao;

public interface IRepositorioAvaliacao {

    void inserirAvaliacao(Avaliacao avaliacao);

    List<Avaliacao> listarAvaliacoes();

    Avaliacao buscarAvaliacao(String id);

    void atualizarAvaliacao(Avaliacao avaliacao);

    void removerAvaliacao(Avaliacao avaliacao);


}
