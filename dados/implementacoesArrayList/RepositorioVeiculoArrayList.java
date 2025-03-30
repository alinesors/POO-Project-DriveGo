package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;

import negocio.basica.modelo.Cidade;
import negocio.basica.modelo.Veiculo;

public class RepositorioVeiculoArrayList {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void SalvarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public RepositorioVeiculoArrayList(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Veiculo buscarVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null; 
    }

    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    public void atualizarVeiculo(Veiculo veiculo) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getPlaca().equals(veiculo.getPlaca())) {
                veiculos.set(i, veiculo);
                return;
            }
        }
    }

    public void removerVeiculo(String placa) {
        veiculos.removeIf(v -> v.getPlaca().equals(placa));
    }



}
