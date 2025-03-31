package dados.Interface;

import java.util.List;
import negocio.basica.modelo.Veiculo;

public interface IRepositorioVeiculo {

    void salvarVeiculo(Veiculo entidade);
    
    Veiculo buscarVeiculo(String id);

    void atualizarVeiculo(Veiculo entidade);

    void removerVeiculo(String id);

    List<Veiculo> listarVeiculos();

    List<Veiculo> listarPorTipo(String tipo);

    

}
