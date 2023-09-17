package entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Corretora_tb")

public class Corretora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String noome;


    //construtor

    public Corretora(String noome) {
        this.noome = noome;
    }


    //getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Corretora{" +
                "id=" + id +
                '}';
    }
}
