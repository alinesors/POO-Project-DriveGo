package dados.implementacoesArrayList;

import java.util.ArrayList;
import negocio.basica.modelo.Viagem;
import java.util.List;
import dados.implementacoes.RepositorioViagemInterface; 


public class RepositorioViagemArrayList {

    private List<Viagem> viagens;

    public void salvarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public Viagem buscarViagem(String id) {
        for (Viagem viagem : viagens) {
            if (viagem.getId().equals(id)) {
                return viagem;
            }
        }
        return null; 
    }

    public List<Viagem> listarViagens() {
        return viagens;
    }

    public void atualizarViagem(Viagem viagem) {
        for (int i = 0; i < viagens.size(); i++) {
            if (viagens.get(i).getId().equals(viagem.getId())) {
                viagens.set(i, viagem);
                return;
            }
        }
    }

    public void removerViagem(Viagem viagem) {
        viagens.removeIf(v -> v.equals(viagem));
    }

}
