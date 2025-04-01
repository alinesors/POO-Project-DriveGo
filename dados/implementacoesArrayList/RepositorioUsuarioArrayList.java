package dados.implementacoesArrayList;

import dados.Interface.IRepositorioUsuario;
import java.util.ArrayList;
import java.util.List;

import negocio.basica.modelo.Cliente;
import negocio.basica.modelo.Motorista;
import negocio.basica.modelo.Pessoa;

public class RepositorioUsuarioArrayList implements IRepositorioUsuario{

    private final List<Pessoa> pessoas;

    public RepositorioUsuarioArrayList() {
        this.pessoas = new ArrayList<>();
    }

    @Override
    public void salvar(Pessoa entidade) {
        pessoas.add(entidade);
    }

    @Override
    public Pessoa buscarPorId(String id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }
        }
        return null; 
    }

    @Override
    public void atualizar(Pessoa entidade) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId().equals(entidade.getId())) {
                pessoas.set(i, entidade);
                return;
            }
        }
    }

    @Override
    public void deletar(String id) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId().equals(id)) {
                pessoas.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Pessoa> listarTodos() {
        return pessoas;
    }

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Cliente cliente) {
                clientes.add((Cliente) cliente);
            }
        }
        return clientes;
    }

    @Override
    public List<Motorista> listarMotoristas() {
        List<Motorista> motoristas = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Motorista motorista) {
                motoristas.add(motorista);
            }
        }
        return motoristas;
    }
}


