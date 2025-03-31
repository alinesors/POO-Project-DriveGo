package servico;

import dados.Interface.*;
import java.util.List;
import negocio.basica.modelo.Veiculo;


public class VeiculoServico {

    private IRepositorioVeiculo repositorioVeiculo;

    public VeiculoServico() {
   
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
