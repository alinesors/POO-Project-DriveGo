package dados.implementacoesArrayList;

import java.util.List;
import negocio.basica.modelo.Viagem;


public class RepositorioViagemArrayList {

    private List<Viagem> viagens;

    public void salvarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public Viagem buscarViagem(String id) {
       
        return null; 
    }

    public List<Viagem> listarViagens() {
        return viagens;
    }

    public void atualizarViagem(Viagem viagem) {
        
        
    }



}
