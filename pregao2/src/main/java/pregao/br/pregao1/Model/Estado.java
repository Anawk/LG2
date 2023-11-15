package pregao.br.pregao1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estado {
    private int idEstado;
    private String nome;
    private List<Cidade> cidades;

    public Estado(String nome) {
        this.nome = nome;
        this.cidades = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade){
        this.cidades.add(cidade);
    }
    public void exibirInformacoes() {
        System.out.println("ID do Estado: " + idEstado);
        System.out.println("Nome do Estado: " + nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estado estado = (Estado) obj;
        return idEstado == estado.idEstado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstado);
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

}
