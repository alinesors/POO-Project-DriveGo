package dados.implementacoesArrayList;
import java.util.List;
import dados.Interface.IRepositorioViagem;
import negocio.basica.modelo.Viagem;


public class RepositorioViagemArrayList implements IRepositorioViagem{

    private List<Viagem> viagens;

    @Override
    public void salvarViagem(Viagem entidade) {
        viagens.add(entidade);
    }

    @Override
    public Viagem buscarViagem(String id) {
        for (Viagem viagem : viagens) {
            if (String.valueOf(viagem.getId()).equals(id)) {
                return viagem;
            }
        }
        return null;  
    }

    @Override
    public void atualizarViagem(Viagem entidade) {
        for (int i = 0; i < viagens.size(); i++) {
            if (viagens.get(i).getId().equals(entidade.getId())) {
                viagens.set(i, entidade);
                return;
            }
        }
       
    }

    @Override
    public void removerViagem(String id) {
        for (int i = 0; i < viagens.size(); i++) {
            if (String.valueOf(viagens.get(i).getId()).equals(id)) {
                viagens.remove(i);
                return;
            }
        }
        
    }

    @Override
    public List<Viagem> listarViagens() {
        return viagens;
        
    }

    @Override
    public List<Viagem> listarPorCliente(String clienteId) {
        for (Viagem viagem : viagens) {
            if (viagem.getClienteId().equals(clienteId)) {
                return viagens;
            }
        }
        return null;

        
    }

    @Override
    public List<Viagem> listarPorMotorista(String motoristaId) {
        for (Viagem viagem : viagens) {
            if (viagem.getMotoristaId().equals(motoristaId)) {
                return viagens;
            }
        }
        return null;
        
    }



}
