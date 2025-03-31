package dados.implementacoesArrayList;

import java.util.List;
import negocio.basica.modelo.Veiculo;

public class RepositorioVeiculoArrayList {

public interface VeiculoRepositorio  {
    List<Veiculo> listarPorTipo(String tipo);
}

}
