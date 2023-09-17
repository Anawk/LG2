package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ativo_tb")

public class Ativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String setor;
    @Column
    private Double valoratual;
    @Column
    private String codigo;
    @Column
    private int QuantidadeDisponivel;



    //construtores

    public Ativo(String nome, String setor, Double valoratual, String codigo, int QuantidadeDisponivel) {
        this.nome = nome;
        this.setor = setor;
        this.valoratual = valoratual;
        this.codigo = codigo;
        this.QuantidadeDisponivel = QuantidadeDisponivel;


    }

    //métodos getters e setters
    public void vender(Investidor i, Integer qtd){
        if ((this.QuantidadeDisponivel - qtd)> 0)
            this.QuantidadeDisponivel -= qtd;

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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getValoratual() {
        return valoratual;
    }

    public void setValoratual(Double valoratual) {
        this.valoratual = valoratual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeDisponivel() {
        return QuantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        QuantidadeDisponivel = quantidadeDisponivel;
    }

    // Método para atualizar o preço do ativo

    public void atualizarPreco(double novoPreco) {
        this.valoratual = novoPreco;
    }

    //Exibe informações do ativo

    public void mostrarInfoAtivo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço Atual: " + valoratual);
        System.out.println("Quantidade Disponível: " + QuantidadeDisponivel);
        System.out.println("Código:" + codigo);
    }



    public double calcularValor() {
        return getValoratual() * getQuantidadeDisponivel();
    }


    @Override
    public String toString() {
        return "Ativo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", valoratual=" + valoratual +
                ", codigo='" + codigo + '\'' +
                ", QuantidadeDisponivel=" + QuantidadeDisponivel +
                '}';
    }
}


