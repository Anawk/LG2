package pregao.br.pregao1.Util;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha <T>{
    private Nodo<T> topo;
    private ArrayList<T> elementos;


    public Pilha() {
        this.topo = null;
        this.elementos = new ArrayList<>();
    }


    public void empilhar(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        novoNodo.setProximo(topo);
        topo = novoNodo;
    }

    public T desempilhar() {
        if (topo != null) {
            T dado = topo.getDado();
            topo = topo.getProximo();
            return dado;
        }
        return null;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T consultarTopo() {
        return (topo != null) ? topo.getDado() : null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

}
