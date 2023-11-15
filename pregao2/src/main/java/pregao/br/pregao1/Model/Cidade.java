package pregao.br.pregao1.Model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cidade cidade = (Cidade) obj;
        return idCidade == cidade.idCidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCidade);
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
