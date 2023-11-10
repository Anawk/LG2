package pregao.br.pregao1.Util;

public class Arvore <T> {
    private NodoArvore<T> raiz;


    public Arvore() {
        this.raiz = null;
    }


    public void inserir(T dado) {
        raiz = inserirRecursivo(raiz, dado);
    }

    private NodoArvore<T> inserirRecursivo(NodoArvore<T> nodo, T dado) {
        if (nodo == null) {
            return new NodoArvore<>(dado);
        }

        if (compare(dado, nodo.getDado()) < 0) {
            nodo.setFilhoEsquerda(inserirRecursivo(nodo.getFilhoEsquerda(), dado));
        } else if (compare(dado, nodo.getDado()) > 0) {
            nodo.setFilhoDireita(inserirRecursivo(nodo.getFilhoDireita(), dado));
        }

        return nodo;
    }

    public boolean buscar(T dado) {
        return buscarRecursivo(raiz, dado);
    }

    private boolean buscarRecursivo(NodoArvore<T> nodo, T dado) {
        if (nodo == null) {
            return false;
        }

        if (dado.equals(nodo.getDado())) {
            return true;
        }

        return compare(dado, nodo.getDado()) < 0
                ? buscarRecursivo(nodo.getFilhoEsquerda(), dado)
                : buscarRecursivo(nodo.getFilhoDireita(), dado);
    }


    private int compare(T dado1, T dado2) {
        // Método de comparação, substitua conforme necessário
        return Integer.compare(dado1.hashCode(), dado2.hashCode());
    }
}