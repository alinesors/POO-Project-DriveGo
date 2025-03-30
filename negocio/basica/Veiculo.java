package negocio.basica;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private String cor;
    private int anoFabricacao;
    private String placa;

    public Veiculo(String modelo, String marca, String cor, int anoFabricacao, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
    }
}
