package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "investidor_tb")

public class Investidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Nome;
    @Column
    private int Idade;
    @Column
    private String email;
    @Column
    private double Saldo;
    private Double valordepositado;

    //construtor

    public Investidor(String nome, int idade, String email, double saldo, Double valordepositado) {
        Nome = nome;
        Idade = idade;
        this.email = email;
        Saldo = saldo;
        this.valordepositado = valordepositado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public Double getValordepositado() {
        return valordepositado;
    }

    public void setValordepositado(Double valordepositado) {
        this.valordepositado = valordepositado;
    }

        public void depositar(double valordepositado) {
            if (valordepositado > 0) {
                Saldo += valordepositado;
                System.out.println("Depósito de $" + valordepositado + " realizado com sucesso.");
            } else {
                System.out.println("O valor do depósito deve ser maior que zero.");
            }
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
                ", Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", email='" + email + '\'' +
                ", Saldo=" + Saldo +
                ", valordepositado=" + valordepositado +
                '}';
    }
}
