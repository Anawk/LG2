package pregao.br.pregao1.Model;
import pregao.br.pregao1.Model.País;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Investidor {
    private static int contadorInvestidores = 0;

    private int id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String cep;
    private String email;
    private String bairro;
    private String logradouro;

    private Cidade cidade;
    private Estado estado;
    private País pais;
    private float saldo; // Adicionando a variável saldo
    private String senha;
    private String usuario;
    private List<Investidor_Telefone> telefones;


    private List<Transacao> historicoTransacoes;

    public Investidor(String nome, Date dataNascimento, String cpf, String cep, String email, String bairro, String logradouro, Cidade cidade, Estado estado, País pais, String senha, String usuario) {
        this.id = ++contadorInvestidores;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.saldo = 0.0f;
        this.senha = senha;
        this.usuario = usuario;
        this.historicoTransacoes = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }


    public boolean verificarSaldoDisponivel(float valor) {
        return saldo >= valor;
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

    public void adicionarSaldo(float valor) {
        saldo += valor;
    }

    public void diminuirSaldo(float valor) {
        saldo -= valor;
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

    public static boolean verificarIdadeValida(Date dataNascimento) {
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);

        int idade = dataAtual.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        if (dataAtual.get(Calendar.MONTH) < dataNasc.get(Calendar.MONTH) ||
                (dataAtual.get(Calendar.MONTH) == dataNasc.get(Calendar.MONTH) &&
                        dataAtual.get(Calendar.DAY_OF_MONTH) < dataNasc.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        return idade >= 18;
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
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", saldo=" + saldo +
                ", senha='" + senha + '\'' +
                ", usuario='" + usuario + '\'' +
                ", historicoTransacoes=" + historicoTransacoes +
                '}';
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Investidor_Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Investidor_Telefone> telefones) {
        this.telefones = telefones;
    }

    public País getPais() {
        return pais;
    }

    public void setPais(País pais) {
        this.pais = pais;
    }

    public static int getContadorInvestidores() {
        return contadorInvestidores;
    }

    public static void setContadorInvestidores(int contadorInvestidores) {
        Investidor.contadorInvestidores = contadorInvestidores;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
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
