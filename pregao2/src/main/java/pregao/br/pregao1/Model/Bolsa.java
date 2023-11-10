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

//    private Transacao corresponderOrdem(Transacao transacao) {
//        if (transacao.getTipo().equals("Compra")) {
//            for (Transacao venda : transacao) {
//                if (venda.getTipo().equals("Venda") &&
//                        transacao.getValorNegociacao() >= venda.getValorNegociacao() &&
//                        transacao.getQtdAcoes() == venda.getQtdAcoes()) {
//                    return new Transacao();
//                }
//            }
//        } else if (transacao.getTipo().equals("Venda")) {
//
//            for (Transacao compra : transacao) {
//                if (compra.getTipo().equals("Compra") &&
//                        transacao.getValorNegociacao() <= compra.getValorNegociacao() &&
//                        transacao.getQtdAcoes() == compra.getQtdAcoes()) {
//                    return new Transacao();
//                }
//            }
////        }
//        return null;
//    }

    public void imprimirHistoricoNegociacoes() {
        for (Transacao transacao : historicoNegociacoes) {
            System.out.println(transacao);
        }
    }

}
