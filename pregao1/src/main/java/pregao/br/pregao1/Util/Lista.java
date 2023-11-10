package pregao.br.pregao1.Util;

public class Lista <T>{
    private Nodo<T> inicio;


    public Lista() {
        this.inicio = null;
    }

    public void inserirNoInicio(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        novoNodo.setProximo(inicio);
        inicio = novoNodo;
    }

    public void inserirNoFim(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        if (inicio == null) {
            inicio = novoNodo;
        } else {
            Nodo<T> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNodo);
        }
    }

    public boolean remover(T dado) {
        if (inicio != null) {
            if (inicio.getDado().equals(dado)) {
                inicio = inicio.getProximo();
                return true;
            } else {
                Nodo<T> atual = inicio;
                while (atual.getProximo() != null && !atual.getProximo().getDado().equals(dado)) {
                    atual = atual.getProximo();
                }
                if (atual.getProximo() != null) {
                    atual.setProximo(atual.getProximo().getProximo());
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimirLista() {
        Nodo<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public boolean estaVazia() {
        return inicio == null;
    }

}
