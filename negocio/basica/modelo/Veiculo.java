package negocio.basica.modelo;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
