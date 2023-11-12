package pregao.br.pregao1.Model;

import pregao.br.pregao1.Util.Pilha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import pregao.br.pregao1.Model.Investidor.*;

public class Transacao {
    private int id_Transacao;
    private String nomeCorretoraCompradora;
    private String nomeCorretoraVendedora;
    private Date dataHora;
    private int id_InvestidorComprador;
    private int id_InvestidorVendedor;
    private float valorNegociacao;
    private String tipo;
    private String status;
    private int qtdAcoes;
    private float comissao;
    private Acao acao;
    private Investidor investidorComprador;

    private Pilha<Transacao> transacoes;




    public Transacao(String nomeCorretoraVendedora, Date dataHora, Investidor investidorComprador, float valorNegociacao, String tipo, String status, int qtdAcoes, float comissao, Acao acao) {
        this.nomeCorretoraVendedora = nomeCorretoraVendedora;
        this.dataHora = dataHora;
        this.investidorComprador = investidorComprador;
        this.valorNegociacao = valorNegociacao;
        this.tipo = tipo;
        this.status = status;
        this.qtdAcoes = qtdAcoes;
        this.comissao = comissao;
        this.acao = acao;
    }

    public float ValorTotal() {
        return valorNegociacao + comissao;
    }




    public Transacao desfazerUltimaTransacao() {
        return transacoes.desempilhar();
    }
    public void Informacoes() {
        System.out.println("ID da Transação: " + id_Transacao);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Corretora que comprou: " + nomeCorretoraCompradora);
        System.out.println("Corretora que vendeu: " + nomeCorretoraVendedora);
        System.out.println("Investidor que comprou: " + id_InvestidorComprador);
        System.out.println("Investidor que vendeu: " + id_InvestidorVendedor);
        System.out.println("Valor de Negociação: " + valorNegociacao);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
        System.out.println("Quantidade de Ações: " + qtdAcoes);
        System.out.println("Comissão: " + comissao);
    }


    public void processarTransacao(List<Acao> acoes) {
        if (tipo.equals("COMPRA")) {
            Acao acao = this.acao;
            acoes.get(acoes.indexOf(acao)).setValorAcao(valorNegociacao);
        } else if (tipo.equals("VENDA")) {
            Acao acao = this.acao;
            acoes.get(acoes.indexOf(acao)).setValorAcao(valorNegociacao);
        }

        acoes.get(acoes.indexOf(acao)).setValorAcao(valorNegociacao);
    }

    public int getId_Transacao() {
        return id_Transacao;
    }

    public void setId_Transacao(int id_Transacao) {
        this.id_Transacao = id_Transacao;
    }

    public String getId_CorretoraCompradora() {
        return nomeCorretoraCompradora;
    }

    public void setId_CorretoraCompradora(String id_CorretoraCompradora) {
        this.nomeCorretoraCompradora = id_CorretoraCompradora;
    }

    public String getId_CorretoraVendedora() {
        return nomeCorretoraVendedora;
    }

    public void setId_CorretoraVendedora(String id_CorretoraVendedora) {
        this.nomeCorretoraVendedora = id_CorretoraVendedora;
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
