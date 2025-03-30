package negocio.basica;

public class Cliente extends Pessoa{

    private FormaDePagamento formaDePagamento;

    public Cliente(String nome, String cpf, String telefone, String endereco, String email) {
        super(nome, cpf, telefone, endereco, email);
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    
}
