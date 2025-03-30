package dados.Interface;

import java.util.List;

import negocio.basica.modelo.Viagem;

public interface IRepositorioViagem {

    void salvarViagem(Viagem viagem);

    List<Viagem> listarViagens();

    Viagem buscarViagem(String id);

    void atualizarViagem(Viagem viagem);

    void removerViagem(String id);

}

