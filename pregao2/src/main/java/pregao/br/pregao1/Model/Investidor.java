package pregao.br.pregao1.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Investidor {
    private int id;
    private String nome;
    private Date dataNascimento;
    private String CPF;
    private String CEP;
    private String email;
    private String bairro;
    private String logradouro;
    private String senha;
    private String usuario;


    private List<Transacao> historicoTransacoes;

    public Investidor(String nome, Date dataNascimento, String CPF, String CEP, String email, String bairro, String logradouro, String senha, String usuario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.CEP = CEP;
        this.email = email;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.senha = senha;
        this.usuario = usuario;
        this.historicoTransacoes = new ArrayList<>();
    }

    public static Investidor encontrarInvestidorPorCPF(List<Investidor> investidores, String cpf) {
        for (Investidor investidor : investidores) {
            if (investidor.getCPF().equals(cpf)) {
                return investidor;
            }
        }
        return null;
    }
    public static boolean autenticar(String usuario, String senha, Investidor investidor) {
        return investidor.usuario.equals(usuario) && investidor.senha.equals(senha);
    }

    public static Investidor encontrarInvestidorPorUsuario(List<Investidor> investidores, String usuario) {
        for (Investidor investidor : investidores) {
            if (investidor.getUsuario().equals(usuario)) {
                return investidor;
            }
        }
        return null;
    }

    public void attInformacoes(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("----- Histórico de Transações -----");
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao transacao : historicoTransacoes) {
                System.out.println("ID Transação: " + transacao.getId_Transacao());
                System.out.println("Data e Hora: " + transacao.getDataHora());
                System.out.println("Tipo: " + transacao.getTipo());
                System.out.println("Status: " + transacao.getStatus());
                System.out.println("Valor Negociação: " + transacao.getValorNegociacao());
                System.out.println("Quantidade de Ações: " + transacao.getQtdAcoes());
                System.out.println("Comissão: " + transacao.getComissao());
                System.out.println("------------------------------");
            }
        }
    }


    public static void listarInvestidores(List<Investidor> investidores) {
        if (investidores.isEmpty()) {
            System.out.println("Não há investidores cadastrados.");
        } else {
            System.out.println("----- Lista de Investidores -----");
            for (int i = 0; i < investidores.size(); i++) {
                Investidor investidor = investidores.get(i);
                System.out.println(i + ". ID: " + investidor.getId() + ", Nome: " + investidor.getNome());
            }
            System.out.println("---------------------------------");
        }
    }

    public void adicionarTransacao(Transacao transacao) {
        historicoTransacoes.add(transacao);
    }

    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public void setHistoricoTransacoes(List<Transacao> historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }

    @Override
    public String toString() {
        return "Investidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", CPF='" + CPF + '\'' +
                ", CEP='" + CEP + '\'' +
                ", email='" + email + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", senha='" + senha + '\'' +
                ", usuario='" + usuario + '\'' +
                ", historicoTransacoes=" + historicoTransacoes +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
