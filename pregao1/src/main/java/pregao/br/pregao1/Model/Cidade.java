package pregao.br.pregao1.Model;

public class Cidade {
    private int idCidade;
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }
    public void exibirInformacoes() {
        System.out.println("ID da Cidade: " + idCidade);
        System.out.println("Nome da Cidade: " + nome);
    }


    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
