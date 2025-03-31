package servico;

import java.util.List;
import dados.Interface.IRepositorioPagamento;
import dados.implementacoesArrayList.RepositorioPagamentoArrayList;
import negocio.basica.modelo.Pagamento;


import negocio.basica.modelo.FormaDePagamento;

public class PagamentoServico {

    private IRepositorioPagamento repositorioPagamento;

    public PagamentoServico(IRepositorioPagamento repositorioPagamento) {
        this.repositorioPagamento = repositorioPagamento;
    }

    public PagamentoServico() {
        this.repositorioPagamento = new RepositorioPagamentoArrayList();
    }

    public void cadastrarFormaDePagamento(FormaDePagamento formaDePagamento) {
        repositorioPagamento.salvarFormaDePagamento(formaDePagamento);
    }

    public List<FormaDePagamento> listarFormasDePagamento() {
        return repositorioPagamento.listarFormasDePagamento();
    }

    public FormaDePagamento buscarFormaDePagamento(String id) {
        return repositorioPagamento.buscarFormaDePagamento(id);
    }

    public void atualizarFormaDePagamento(FormaDePagamento formaDePagamento) {
        repositorioPagamento.atualizarFormaDePagamento(formaDePagamento);
    }

    public void removerFormaDePagamento(FormaDePagamento formaDePagamento) {
        repositorioPagamento.removerFormaDePagamento(formaDePagamento);
    }


}
