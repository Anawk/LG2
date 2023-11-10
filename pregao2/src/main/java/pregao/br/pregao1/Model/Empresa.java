package pregao.br.pregao1.Model;

public class Empresa {
    private int id;
    private String nome;


    public Empresa(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("ID da Empresa: " + id);
        System.out.println("Nome da Empresa: " + nome);
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
}
