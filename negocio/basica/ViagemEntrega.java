package negocio.basica;

public class ViagemEntrega extends Viagem{

    private String pacote;

    public ViagemEntrega(Motorista motorista, Cliente cliente, Origem origem, Destino destino, FormaDePagamento formaDePagamento) {
        super(motorista, cliente, origem, destino, formaDePagamento);
        this.pacote = pacote;
    }
}
