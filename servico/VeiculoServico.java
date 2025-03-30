package servico;

import java.util.List;
import java.util.ArrayList;
import negocio.basica.modelo.Veiculo;
import dados.Interface.*;
import dados.implementacoesArrayList.RespositorioVeiculoArrayList;


public class VeiculoServico {

    private IRepositorioVeiculo repositorioVeiculo;

    public VeiculoServico() {
        this.repositorioVeiculo = new RespositorioVeiculoArrayList();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        repositorioVeiculo.salvarVeiculo(veiculo);
    }

    public Veiculo buscarVeiculo(String placa) {
        return repositorioVeiculo.buscarVeiculo(placa);
    }

    public void atualizarVeiculo(Veiculo veiculo) {
        repositorioVeiculo.atualizarVeiculo(veiculo);
    }

    public void removerVeiculo(String placa) {
        repositorioVeiculo.removerVeiculo(placa);
    }

    public List<Veiculo> listarVeiculos() {
        return repositorioVeiculo.listarVeiculos();
    }

}
