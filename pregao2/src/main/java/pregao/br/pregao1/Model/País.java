package pregao.br.pregao1.Model;

public class País {
    private int id;
    private String nome;
    private String sigla;

    public País(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public void exibirInformacoes() {
        System.out.println("ID do País: " + id);
        System.out.println("Nome do País: " + nome);
        System.out.println("Sigla do País: " + sigla);
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
