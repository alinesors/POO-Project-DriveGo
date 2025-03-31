package negocio.basica.modelo;

public abstract class FormaDePagamento {

    private int id;
    private double valorFinal;

    public FormaDePagamento(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 





}
