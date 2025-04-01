package dados.implementacoesArrayList;

import java.util.ArrayList;
import java.util.List;

import dados.Interface.IRepositorioPagamento;
import negocio.basica.modelo.FormaDePagamento;


public class RepositorioFormaDePagamentoArrayList implements IRepositorioPagamento{

    private final List<FormaDePagamento> FormaDePagamentos;

    public RepositorioFormaDePagamentoArrayList() {
        this.FormaDePagamentos = new ArrayList<>();
    }

    public RepositorioFormaDePagamentoArrayList(List<FormaDePagamento> FormaDePagamentos) {
        this.FormaDePagamentos = FormaDePagamentos;
    }

    @Override
    public FormaDePagamento buscarFormaDePagamento(String id) {

        return null;
    }

    public List<FormaDePagamento> listarFormaDePagamentos() {
        return FormaDePagamentos;
    }

    @Override
    public void atualizarFormaDePagamento(FormaDePagamento FormaDePagamento) {

    }

    @Override
    public void removerFormaDePagamento(FormaDePagamento FormaDePagamento) {
        FormaDePagamentos.remove(FormaDePagamento);
    }

    @Override
    public void salvarFormaDePagamento(FormaDePagamento entidade){

    }

    @Override
    public List<FormaDePagamento> listarFormasDePagamento(){
        return FormaDePagamentos;
    }

    @Override
    public List<FormaDePagamento> listarPorCliente(String clienteId){
        return FormaDePagamentos;
    }

}
