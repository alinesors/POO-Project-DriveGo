package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;

import negocio.basica.modelo.Cidade;


public class RepositorioCidadeArrayList {

    private List<Cidade> cidades;

    public RepositorioCidadeArrayList() {
        this.cidades = new ArrayList<>();
    }

    public RepositorioCidadeArrayList(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void SalvarCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }

    public Cidade buscarCidade(String nome) {
        for (Cidade cidade : cidades) {
            if (cidade.getNome().equalsIgnoreCase(nome)) {
                return cidade;
            }
        }
        return null;
    }

    public List<Cidade> listarCidades() {
        return cidades;
    }

    public void atualizarCidade(Cidade cidade) {
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getNome().equalsIgnoreCase(cidade.getNome())) {
                cidades.set(i, cidade);
                return;
            }
        }
    }

    public void removerCidade(String nome) {
        cidades.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }



}
