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

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Avaliacao getAvaliacaoMotorista() {
        return avaliacaoMotorista;
    }

    public void setAvaliacaoMotorista(Avaliacao avaliacaoMotorista) {
        this.avaliacaoMotorista = avaliacaoMotorista;
    }

    public Avaliacao getAvaliacaoCliente() {
        return avaliacaoCliente;
    }

    public void setAvaliacaoCliente(Avaliacao avaliacaoCliente) {
        this.avaliacaoCliente = avaliacaoCliente;
    }
}
