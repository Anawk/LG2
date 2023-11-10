package pregao.br.pregao1.Util;

public class NodoArvore <T>{
    private T dado;
    private NodoArvore<T> filhoEsquerda;
    private NodoArvore<T> filhoDireita;

    public NodoArvore(T dado) {
        this.dado = dado;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }

    public T getDado() {
        return dado;
    }

    public NodoArvore<T> getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(NodoArvore<T> filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public NodoArvore<T> getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(NodoArvore<T> filhoDireita) {
        this.filhoDireita = filhoDireita;
    }
}


