package entity;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;
@Entity
@Table(name = "Custodiante_tb")

public class Custodiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Map<String, Integer> carteira; // Um mapa para rastrear as ações do investidor

    //construtor
    public Custodiante(Map<String, Integer> carteira) {
        this.carteira = carteira;
    }
    //getters e setters
    public Map<String, Integer> getCarteira() {
        return carteira;
    }

    public void setCarteira(Map<String, Integer> carteira) {
        this.carteira = carteira;
    }

    public Custodiante() {
        carteira = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Custodiante{" +
                "carteira=" + carteira +
                '}';
    }
}
