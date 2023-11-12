package pregao.br.pregao1.Model;

import java.util.List;

public class Corretora_Telefone {
    private int idTelefone;
    private int DDD;
    private int numero;

    public Corretora_Telefone(int DDD, int numero) {
        this.DDD = DDD;
        this.numero = numero;
    }

    public static void adicionarTelefone(List<Corretora_Telefone> telefones, int ddd, int numero) {
        Corretora_Telefone telefone = new Corretora_Telefone(ddd, numero);
        telefones.add(telefone);
    }



    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
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
