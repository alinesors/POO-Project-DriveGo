package dados.Interface;


import negocio.basica.modelo.Cidade;

public interface IRepositorioCidade {

    void salvarCidade(Cidade cidade); // Método para salvar uma cidade

    Cidade buscarCidade(String nome); // Método para buscar uma cidade pelo nome

    void atualizarCidade(Cidade cidade); // Método para atualizar uma cidade

    void removerCidade(String nome); // Método para remover uma cidade pelo nome

    List<Cidade> listarCidades(); // Método para listar todas as cidades

}
