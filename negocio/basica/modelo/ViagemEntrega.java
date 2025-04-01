package negocio.basica.modelo;

public class ViagemEntrega extends Viagem{

    private String pacote;

    public ViagemEntrega(Motorista motorista, Cliente cliente, Origem origem, Destino destino, FormaDePagamento formaDePagamento, String pacote) {
        super(motorista, cliente, origem, destino, formaDePagamento);
        this.pacote = pacote;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    
}
