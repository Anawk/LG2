package entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Bolsa_tb")
public class Bolsa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    private List<Ativo>ativos;
    private List<Ordem>ordens;


    public Bolsa(String nome) {
        this.nome = nome;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ativo> getAtivos() {
        return ativos;
    }

    public void setAtivos(List<Ativo> ativos) {
        this.ativos = ativos;
    }

    public List<Ordem> getOrdens() {
        return ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }

    @Override
    public String toString() {
        return "Bolsa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ativos=" + ativos +
                ", ordens=" + ordens +
                '}';
    }
}


