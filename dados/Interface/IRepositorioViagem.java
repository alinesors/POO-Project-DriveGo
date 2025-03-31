package dados.Interface;

import java.util.List;
import negocio.basica.modelo.Viagem;

public interface IRepositorioViagem {

    void salvarViagem(Viagem entidade);

    Viagem buscarViagem(String id);

    void atualizarViagem(Viagem entidade);

    void removerViagem(String id);

    List<Viagem> listarViagens();

    List<Viagem> listarPorCliente(String clienteId);
    
    List<Viagem> listarPorMotorista(String motoristaId);

}

