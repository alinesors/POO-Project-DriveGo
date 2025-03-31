package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;
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

        return null;
    }

    public List<FormaDePagamento> listarFormaDePagamentos() {
        return FormaDePagamentos;
    }

    public void atualizarFormaDePagamento(FormaDePagamento FormaDePagamento) {

    }

    public void removerFormaDePagamento(FormaDePagamento FormaDePagamento) {
        FormaDePagamentos.remove(FormaDePagamento);
    }

}
