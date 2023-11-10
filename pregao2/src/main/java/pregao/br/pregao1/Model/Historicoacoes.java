package pregao.br.pregao1.Model;
import pregao.br.pregao1.Util.Lista;

public class Historicoacoes {
    private int id;
    private Lista<Transacao> historico;


    public Historicoacoes(){
        this.historico = new Lista<>();
    }

    public void registrarOrdem(Transacao transacao) {
        historico.inserirNoInicio(transacao);
    }

    public void imprimirHistorico() {
        historico.imprimirLista();
    }
}
