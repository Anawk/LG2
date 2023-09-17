package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Carteira_tb")

public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private Double valor;
    private Investidor investidor;
    private List<Ativo>ativos;

    //construtor
    public Carteira(String nome, Double valor, Investidor investidor) {
        this.nome = nome;
        this.valor = valor;
        this.investidor = investidor;
    }

    //getters e setters
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

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public List<Ativo> getAtivos() {
        return ativos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setAtivos(List<Ativo> ativos) {
        this.ativos = ativos;
    }

//precisa fazer metodo verifica valor da carteira



    @Override
    public String toString() {
        return "Carteira{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", investidor=" + investidor +
                ", ativos=" + ativos +
                '}';
    }
}
