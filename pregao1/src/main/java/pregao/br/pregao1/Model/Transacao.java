package pregao.br.pregao1.Model;

import pregao.br.pregao1.Util.Pilha;

import java.util.Date;

public class Transacao {
    private int id_Transacao;
    private int id_CorretoraCompradora;
    private int id_CorretoraVendedora;
    private Date dataHora;
    private int id_InvestidorComprador;
    private int id_InvestidorVendedor;
    private float valorNegociacao;
    private String tipo;
    private String status;
    private int qtdAcoes;
    private float comissao;

    private Pilha<Transacao> transacoes;

    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        Historicoacoes historicoAcoes = new Historicoacoes();

        Investidor investidor1 = new Investidor("Ana Maria", 04-01-2006, "4525245346536", "89747-000", "aninha@gmail.com","jd.santos", "usdifhusdfbvdjb", "3333", "aninha123");

        Transacao ordemCompra1 = new Transacao();
        Transacao ordemCompra2 = new Transacao();
        Transacao ordemVenda1 = new Transacao();
        Transacao ordemVenda2 = new Transacao();

        // Registrar as ordens no histórico de ações
        bolsa.realizarNegociacao(historicoNegociacoes(ordemCompra1, ordemVenda1));
        bolsa.realizarNegociacao(historicoNegociacoes(ordemCompra2, ordemVenda2));


    }


    public Transacao(int id_CorretoraCompradora, int id_CorretoraVendedora, Date dataHora, int id_InvestidorComprador, int id_InvestidorVendedor, float valorNegociacao, String tipo, String status, int qtdAcoes, float comissao) {
        this.id_CorretoraCompradora = id_CorretoraCompradora;
        this.id_CorretoraVendedora = id_CorretoraVendedora;
        this.dataHora = dataHora;
        this.id_InvestidorComprador = id_InvestidorComprador;
        this.id_InvestidorVendedor = id_InvestidorVendedor;
        this.valorNegociacao = valorNegociacao;
        this.tipo = tipo;
        this.status = status;
        this.qtdAcoes = qtdAcoes;
        this.comissao = comissao;
        transacoes = new Pilha<>();
    }

    public float ValorTotal() {
        return valorNegociacao + comissao;
    }


    public void adicionarTransacao(Transacao transacao) {
        transacoes.empilhar(transacao);
    }

    public Transacao desfazerUltimaTransacao() {
        return transacoes.desempilhar();
    }
    public void Informacoes() {
        System.out.println("ID da Transação: " + id_Transacao);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Corretora que comprou: " + id_CorretoraCompradora);
        System.out.println("Corretora que vendeu: " + id_CorretoraVendedora);
        System.out.println("Investidor que comprou: " + id_InvestidorComprador);
        System.out.println("Investidor que vendeu: " + id_InvestidorVendedor);
        System.out.println("Valor de Negociação: " + valorNegociacao);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
        System.out.println("Quantidade de Ações: " + qtdAcoes);
        System.out.println("Comissão: " + comissao);
    }


    public int getId_Transacao() {
        return id_Transacao;
    }

    public void setId_Transacao(int id_Transacao) {
        this.id_Transacao = id_Transacao;
    }

    public int getId_CorretoraCompradora() {
        return id_CorretoraCompradora;
    }

    public void setId_CorretoraCompradora(int id_CorretoraCompradora) {
        this.id_CorretoraCompradora = id_CorretoraCompradora;
    }

    public int getId_CorretoraVendedora() {
        return id_CorretoraVendedora;
    }

    public void setId_CorretoraVendedora(int id_CorretoraVendedora) {
        this.id_CorretoraVendedora = id_CorretoraVendedora;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getId_InvestidorComprador() {
        return id_InvestidorComprador;
    }

    public void setId_InvestidorComprador(int id_InvestidorComprador) {
        this.id_InvestidorComprador = id_InvestidorComprador;
    }

    public int getId_InvestidorVendedor() {
        return id_InvestidorVendedor;
    }

    public void setId_InvestidorVendedor(int id_InvestidorVendedor) {
        this.id_InvestidorVendedor = id_InvestidorVendedor;
    }

    public float getValorNegociacao() {
        return valorNegociacao;
    }

    public void setValorNegociacao(float valorNegociacao) {
        this.valorNegociacao = valorNegociacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
