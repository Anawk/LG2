package pregao.br.pregao1.Model;

public class Estado {
    private int idEstado;
    private String nome;
    private String sigla;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public void exibirInformacoes() {
        System.out.println("ID do Estado: " + idEstado);
        System.out.println("Nome do Estado: " + nome);
        System.out.println("Sigla do Estado: " + sigla);
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
}
