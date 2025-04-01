package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;

import dados.Interface.IRepositorioCidade;
import negocio.basica.modelo.Cidade;


public class RepositorioCidadeArrayList implements IRepositorioCidade{

    private final List<Cidade> cidades;

    public RepositorioCidadeArrayList() {
        this.cidades = new ArrayList<>();
    }

    public RepositorioCidadeArrayList(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public Cidade buscarCidade(String nome) {
        for (Cidade cidade : cidades) {
            if (cidade.getNome().equalsIgnoreCase(nome)) {
                return cidade;
            }
        }
        return null;
    }

    @Override
    public List<Cidade> listarCidades() {
        return cidades;
    }

    @Override
    public void atualizarCidade(Cidade cidade) {
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getNome().equalsIgnoreCase(cidade.getNome())) {
                cidades.set(i, cidade);
                return;
            }
        }
    }

    @Override
    public void removerCidade(String nome) {
        cidades.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public void salvarCidade(Cidade cidade) {
        cidades.add(cidade);
    }
}
