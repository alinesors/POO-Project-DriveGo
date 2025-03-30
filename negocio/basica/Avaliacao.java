package negocio.basica;

public class Avaliacao {

    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }

    public Avaliacao() {
        this.nota = 0;
        this.comentario = "";
    }
}