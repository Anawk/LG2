package pregao.br.pregao1.Model;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
     private int id;
    private List<Transacao> historicoNegociacoes;


    public Bolsa() {
        historicoNegociacoes = new ArrayList<>();
    }

    public void realizarNegociacao(Transacao transacao) {
        historicoNegociacoes.add(transacao);
    }

    public void imprimirHistoricoNegociacoes() {
        for (Transacao transacao : historicoNegociacoes) {
            System.out.println(transacao);
        }
    }

}
