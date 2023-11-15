package pregao.br.pregao1.Model;

import pregao.br.pregao1.Util.Lista;

import java.util.ArrayList;
import java.util.List;

public class Corretora {
    private int idCorretora;
    private String razaoSocial;
    private long CNPJ;
    private String nomeFantasia;
    private String email;
    private String logradouro;
    private String CEP;
    private String bairro;
    private String senha;
    private String usuario;

    private Cidade cidade;
    private Estado estado;
    private País pais;
    private List<Corretora_Telefone> telefones;

    private Lista<Investidor> investidores;

    public Corretora(String razaoSocial, long CNPJ, String nomeFantasia, String email, String logradouro, String CEP, String bairro,Cidade cidade, Estado estado, País pais, String senha, String usuario) {
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.logradouro = logradouro;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.senha = senha;
        this.usuario = usuario;
        this.telefones = new ArrayList<>();
    }



    public void adicionarTelefone(Corretora_Telefone telefone) {
        this.telefones.add(telefone);
    }
    public void adicionarInvestidor(Investidor investidor) {
        investidores.inserirNoFim(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remover(investidor);
    }

    public void imprimirListaInvestidores() {
      investidores.imprimirLista();
    }
    public boolean fazerLogin(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }


    public void attInformacoes(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Corretora{" +
                "idCorretora=" + idCorretora +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", CNPJ=" + CNPJ +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", email='" + email + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", CEP='" + CEP + '\'' +
                ", bairro='" + bairro + '\'' +
                ", senha='" + senha + '\'' +
                ", usuario='" + usuario + '\'' +
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

    public País getPais() {
        return pais;
    }

    public void setPais(País pais) {
        this.pais = pais;
    }

    public List<Corretora_Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Corretora_Telefone> telefones) {
        this.telefones = telefones;
    }

    public Lista<Investidor> getInvestidores() {
        return investidores;
    }

    public void setInvestidores(Lista<Investidor> investidores) {
        this.investidores = investidores;
    }

    public int getIdCorretora() {
        return idCorretora;
    }

    public void setIdCorretora(int idCorretora) {
        this.idCorretora = idCorretora;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
