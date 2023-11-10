package pregao.br.pregao1.Util;

public class Nodo <T>{
    private T dado;
    private Nodo<T> proximo;

    // Construtor
    public Nodo(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    // Métodos Getters e Setters
    public T getDado() {
        return dado;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }
}
