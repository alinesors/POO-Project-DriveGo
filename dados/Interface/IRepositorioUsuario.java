package dados.Interface;

import java.util.List;
import negocio.basica.modelo.Cliente;
import negocio.basica.modelo.Motorista;
import negocio.basica.modelo.Pessoa;

public interface IRepositorioUsuario {

    void salvar(Pessoa entidade);
    
    Pessoa buscarPorId(String id);

    void atualizar(Pessoa entidade);

    void deletar(String id);

    List<Pessoa> listarTodos();

    List<Cliente> listarClientes();

    List<Motorista> listarMotoristas();
}
