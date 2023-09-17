package entity;

import jakarta.persistence.*;

import java.util.Scanner;

@Entity
@Table(name = "Corretora_tb")

public class Corretora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;


    //construtor

    public Corretora(String nome) {
        this.nome = nome;
    }


    //getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static void corretora(){

        Scanner scan = new Scanner(System.in);

        System.out.println("|Escolha a corretora:                  |");
        System.out.println("|1) Xp Investimentos                   |");
        System.out.println("|2) Clear Corretora                    |");
        System.out.println("|3) Rico Investimentos                 |");
        System.out.println("|4) Banco Inter                        |\n");
        System.out.println("|OBS: Apenas operam na Bolsa 'B3'      |");
        System.out.println("========================================");
       scan.nextLine();
        System.out.println(scan);





    }

    @Override
    public String toString() {
        return "Corretora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
