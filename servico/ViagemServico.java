package servico;
import dados.Interface.IRepositorioViagem;
import java.util.List;
import negocio.basica.modelo.Viagem;


public class ViagemServico {

    private IRepositorioViagem repositorioViagem;

    public ViagemServico(IRepositorioViagem repositorioViagem) {
        this.repositorioViagem = repositorioViagem;
    }

    public ViagemServico(){
      
    }

    public void cadastrarViagem(Viagem viagem) {
        repositorioViagem.salvarViagem(viagem);
    }

    public List<Viagem> listarViagens() {
        return repositorioViagem.listarViagens();
    }

    public Viagem buscarViagem(String id) {
        return repositorioViagem.buscarViagem(id);
    }

    public void atualizarViagem(Viagem viagem) {
        repositorioViagem.atualizarViagem(viagem);
    }

    public void removerViagem(String id) {
        repositorioViagem.removerViagem(id);
    }








}
