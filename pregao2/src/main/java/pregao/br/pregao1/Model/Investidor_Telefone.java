package pregao.br.pregao1.Model;

import java.util.List;

public class Investidor_Telefone {
    private int id;
    private int DDD;
    private int numero;

    public Investidor_Telefone(int DDD, int numero) {
        this.DDD = DDD;
        this.numero = numero;
    }

    public static void addTelefone(List<Investidor_Telefone> telefones, int ddd, int numero) {
        Investidor_Telefone telefone = new Investidor_Telefone(ddd, numero);
        telefones.add(telefone);
    }

    public void exibirInformacoes() {
        System.out.println("ID do Telefone: " + id);
        System.out.println("DDD: " + DDD);
        System.out.println("Número do Telefone: " + numero);
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
