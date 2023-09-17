package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ordem_tb")

public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int quantidade;
    private Investidor investidor;
    private Ativo ativo;
    private boolean compra; //true para compras, false para vendas
    private double preco;

    //construtor
    public Ordem(int quantidade, Investidor investidor, Ativo ativo, boolean compra, double preco) {
        this.quantidade = quantidade;
        this.investidor = investidor;
        this.ativo = ativo;
        this.compra = compra;
        this.preco = preco;
    }

    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public boolean isCompra() {
        return compra;
    }

    public void setCompra(boolean compra) {
        this.compra = compra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Ordem{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", investidor=" + investidor +
                ", ativo=" + ativo +
                ", compra=" + compra +
                ", preco=" + preco +
                '}';
    }
}
