package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "investidor_tb")

public class Investidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private double Saldo;


    public Investidor(String nome, double saldo) {
        this.nome = nome;
        Saldo = saldo;
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

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public void comprarAcao(Ativo ativo) {
        if (ativo.calcularValor() > Saldo) {
            throw new RuntimeException("Seu saldo é insuficiente para a compra desta ação");

        }
    }



    @Override
    public String toString() {
        return "Investidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
