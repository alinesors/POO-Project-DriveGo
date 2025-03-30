package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;
import negocio.basica.modelo.FormaDePagamento;
import negocio.basica.modelo.FormaDePagamento;

public class RepositorioFormaDePagamentoArrayList {

    private List<FormaDePagamento> FormaDePagamentos;

    public RepositorioFormaDePagamentoArrayList() {
        this.FormaDePagamentos = new ArrayList<>();
    }

    public RepositorioFormaDePagamentoArrayList(List<FormaDePagamento> FormaDePagamentos) {
        this.FormaDePagamentos = FormaDePagamentos;
    }

    public void SalvarFormaDePagamento(FormaDePagamento FormaDePagamento) {
        this.FormaDePagamentos.add(FormaDePagamento);
    }

    public FormaDePagamento buscarFormaDePagamento(String id) {
        for (FormaDePagamento FormaDePagamento : FormaDePagamentos) {
            if (FormaDePagamento.getId().equals(id)) {
                return FormaDePagamento;
            }
        }
        return null;
    }

    public List<FormaDePagamento> listarFormaDePagamentos() {
        return FormaDePagamentos;
    }

    public void atualizarFormaDePagamento(FormaDePagamento FormaDePagamento) {
        for (int i = 0; i < FormaDePagamentos.size(); i++) {
            if (FormaDePagamentos.get(i).getId().equals(FormaDePagamento.getId())) {
                FormaDePagamentos.set(i, FormaDePagamento);
                return;
            }
        }
    }

    public void removerFormaDePagamento(FormaDePagamento FormaDePagamento) {
        FormaDePagamentos.remove(FormaDePagamento);
    }

}
