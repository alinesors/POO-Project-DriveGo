package dados.implementacoesArrayList;

import java.util.ArrayList;
import dados.implementacoes.*; 
import java.util.List;
import negocio.basica.modelo.Pessoa;

public class RepositorioUsuarioArrayList{

    private final List<Pessoa> usuarios = new ArrayList<>();

    public void SalvarUsuario(Pessoa usuario) {
        usuarios.add(usuario);
    }

    public Pessoa buscarUsuario(String cpf) {
        for (Pessoa usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null; 
    }


    public List<Pessoa> listarUsuarios() {
        return usuarios;
    }

    public void atualizarUsuario(Pessoa usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCpf().equals(usuario.getCpf())) {
                usuarios.set(i, usuario);
                return;
            }
        }
    }

    public void removerUsuario(String cpf) {
        usuarios.removeIf(u -> u.getCpf().equals(cpf));
    }



}


