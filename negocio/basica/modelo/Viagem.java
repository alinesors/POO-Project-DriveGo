package negocio.basica.modelo;

public abstract class Viagem {

    private Motorista motorista;
    private Cliente cliente;
    private Origem origem;
    private Destino destino;
    private FormaDePagamento formaDePagamento;
    private String status;
    private double valorFinal;
    private Avaliacao avaliacaoMotorista;
    private Avaliacao avaliacaoCliente;

    public Viagem(Motorista motorista, Cliente cliente, Origem origem, Destino destino, FormaDePagamento formaDePagamento) {
        this.motorista = motorista;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.formaDePagamento = formaDePagamento;
        this.status = "Solicitada";
        this.valorFinal = 0.0;
        this.avaliacaoMotorista = new Avaliacao();
        this.avaliacaoCliente = new Avaliacao();
    }
}
