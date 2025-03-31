package dados.Interface;

import java.util.List;
import negocio.basica.modelo.FormaDePagamento;

public interface IRepositorioPagamento {

    void salvarFormaDePagamento(FormaDePagamento entidade);

    FormaDePagamento buscarFormaDePagamento(String id);

    void atualizarFormaDePagamento(FormaDePagamento entidade);

    void removerFormaDePagamento(FormaDePagamento formaDePagamento);

    List<FormaDePagamento> listarFormasDePagamento();

    List<FormaDePagamento> listarPorCliente(String clienteId);

}
