package negocio.basica.modelo;

public class Motorista extends Pessoa{

    private String cnh;
    private Veiculo tipoVeiculo;
    private boolean disponibilidade;
    
    public Motorista(String nome, String cpf, String telefone, String endereco, String email, String cnh, Veiculo tipoVeiculo) {
        super(nome, cpf, telefone, endereco, email);
        this.cnh = cnh;
        this.tipoVeiculo = tipoVeiculo;
        this.disponibilidade = true;
    }
    

}
