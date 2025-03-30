package negocio.basica.modelo;

public abstract class Local {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String pontoReferencia;


    public Local(String rua, String numero, String bairro, String cidade, String estado, String cep, String complemento, String pontoReferencia) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        this.pontoReferencia = pontoReferencia;
    }
}
