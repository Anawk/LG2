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


    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    public void attInformacoes(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void visualizarHistoricoTransacoes() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("O histórico de transações está vazio.");
        } else {
            System.out.println("Histórico de Transações:");
            for (Transacao transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
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
