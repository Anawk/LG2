package pregao.br.pregao1.Model;

public class Corretora_Telefone {
    private int idTelefone;
    private int DDD;
    private int numero;

    public Corretora_Telefone(int DDD, int numero) {
        this.DDD = DDD;
        this.numero = numero;
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
