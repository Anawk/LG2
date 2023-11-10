package pregao.br.pregao1.Util;

public class Fila <T>{
    private Nodo<T> inicio;
    private Nodo<T> fim;


    public Fila() {
        this.inicio = null;
        this.fim = null;
    }


    public void enfileirar(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (estaVazia()) {
            inicio = novoNodo;
            fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            fim = novoNodo;
        }
    }

    public T desenfileirar() {
        if (!estaVazia()) {
            T dado = inicio.getDado();
            inicio = inicio.getProximo();
            if (inicio == null) {
                fim = null; // Se a fila ficar vazia, atualiza o fim também
            }
            return dado;
        }
        return null;
    }

    public T consultarInicio() {
        return (inicio != null) ? inicio.getDado() : null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
