package pregao.br.pregao1.Util;

public class Pilha <T>{
    private Nodo<T> topo;

    public Pilha() {
        this.topo = null;
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

    public T consultarTopo() {
        return (topo != null) ? topo.getDado() : null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

}
