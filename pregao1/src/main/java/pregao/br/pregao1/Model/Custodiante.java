package pregao.br.pregao1.Model;

import java.util.ArrayList;
import java.util.List;

public class Custodiante {
    private int idCustodiante;
    private String nome;
    private List<Acao> acoes;

    public Custodiante(String nome) {
        this.nome = nome;
        this.acoes = new ArrayList<>();
    }

    public void addAcao(Acao acao) {
        if (acoes == null) {
            acoes = new ArrayList<>();
        }
        acoes.add(acao);
    }

    public void remoAcao(Acao acao) {
        if (acoes != null) {
            acoes.remove(acao);
        }
    }
    public void InformacoesAcoes() {
        if (acoes != null) {
            System.out.println("Ações sob guarda: " + nome + ":");
            for (Acao acao : acoes) {
                System.out.println(acao);
            }
        } else {
            System.out.println("Nenhuma ação sob guarda:" + nome + ".");
        }
    }

    public int getIdCustodiante() {
        return idCustodiante;
    }

    public void setIdCustodiante(int idCustodiante) {
        this.idCustodiante = idCustodiante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Acao> getAções() {
        return acoes;
    }

    public void setAções(List<Acao> ações) {
        this.acoes = ações;
    }
}
