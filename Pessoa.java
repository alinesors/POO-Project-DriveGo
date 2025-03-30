package negocio.basicas;

public abstract class Pessoa{
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;

    public Pessoa(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public
}
