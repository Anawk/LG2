package pregao.br.pregao1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class País {
    private int id;
    private String nome;

    private List<Estado> estados;

    public País(String nome) {
        this.nome = nome;
        this.estados = new ArrayList<>();
    }

    public void adicionarEstado(Estado estado) {
        this.estados.add(estado);
    }

    public void exibirInformacoes() {
        System.out.println("ID do País: " + id);
        System.out.println("Nome do País: " + nome);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        País país = (País) obj;
        return id == país.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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