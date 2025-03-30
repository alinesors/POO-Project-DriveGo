package negocio.basica.modelo;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;
    private double nota;
    private ArrayList<Double> avaliacoes;

    public Pessoa(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.nota = 0;
        this.avaliacoes = new ArrayList<Double>();
    }

}
