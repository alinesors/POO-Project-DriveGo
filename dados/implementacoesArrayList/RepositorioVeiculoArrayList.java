package dados.implementacoesArrayList;
import dados.interfaces.IRepositorioVeiculo;

import java.util.List;
import negocio.basica.modelo.Veiculo;

public class RepositorioVeiculoArrayList implements IRepositorioVeiculo{

public interface VeiculoRepositorio  {
    List<Veiculo> listarPorTipo(String tipo);
}

}
