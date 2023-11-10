package pregao.br.pregao1.Model;

import pregao.br.pregao1.Util.Arvore;

public class Acao {
    private int codigoAcao;
    private String nome;
    private String sigla;
    private String variacao;
    private int qtdMovimentacao;
    private float valorAcao;

    private Arvore<Acao> arvoreacoes;

    public Acao(String nome, String sigla, String variacao, int qtdMovimentacao, float valorAcao) {
        this.nome = nome;
        this.sigla = sigla;
        this.variacao = variacao;
        this.qtdMovimentacao = qtdMovimentacao;
        this.valorAcao = valorAcao;
        this.arvoreacoes = new Arvore<>();
    }

    public void adicionarAtivo(Acao acao) {
        arvoreacoes.inserir(acao);
    }

    public boolean buscarAtivo(Acao acao) {
        return arvoreacoes.buscar(acao);
    }

    @Override
    public String toString() {
        return "Acao{" +
                "codigoAcao=" + codigoAcao +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", variacao='" + variacao + '\'' +
                ", qtdMovimentacao=" + qtdMovimentacao +
                ", valorAcao=" + valorAcao +
                '}';
    }

    public float calcularValorTotal() {
        return qtdMovimentacao * valorAcao;
    }

    public void movimentarAcoes(int quantidade, boolean compra) {
        if (compra) {
            qtdMovimentacao += quantidade;
        } else {
            if (quantidade <= qtdMovimentacao) {
                qtdMovimentacao -= quantidade;
            } else {
                System.out.println("Quantidade insuficiente para vender.");
            }
        }
    }

    public int getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(int codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getVariacao() {
        return variacao;
    }

    public void setVariacao(String variacao) {
        this.variacao = variacao;
    }

    public int getQtdMovimentacao() {
        return qtdMovimentacao;
    }

    public void setQtdMovimentacao(int qtdMovimentacao) {
        this.qtdMovimentacao = qtdMovimentacao;
    }

    public float getValorAcao() {
        return valorAcao;
    }

    public void setValorAcao(float valorAcao) {
        this.valorAcao = valorAcao;
    }
}
