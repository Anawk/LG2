package javaLG2.estruturaDeDados;

import java.util.Arrays;

/**
 *
 * Uma pilha é uma estrutura genérica para
 *
 * @author fefe
 *
 * @param <T> O tipo da pilha
 */
@SuppressWarnings("unchecked")
public class Pilha<T> {

    /**
     * Os elementos da pilha
     */
    private Object[] elementos;

    /**
     * Também chamado de sentinela, será onde será executada as operações lifo
     */
    private int topo;

    /**
     * O tamanho da pilha
     */
    private int tamanho;

    /**
     * @param A capacidade da pilha
     */
    public Pilha(int capacidade) {
        if (capacidade < 0) {
            throw new RuntimeException("A capacidade não pode ser menor que zero!");
        }
        elementos = new Object[++capacidade];
        topo = -1;

    }

    /**
     * Adiciona um elemento na pilha
     *
     * @param e O elemento a ser adicionado
     */
    public void empilhar(T e) {
        if (taCheio()) {
            throw new RuntimeException("A pilha está cheia!");
        }
        elementos[++topo] = e;
        tamanho++;
    }

    /**
     * Retorna e remove o sentinela (último elemento)
     *
     * @return O sentinela
     *
     */
    public T desempilhar() {
        if (taVazio()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        T ultimoValor = (T) elementos[topo];
        elementos[topo] = null;
        tamanho--;
        topo--;
        return ultimoValor;
    }

    public boolean taCheio() {
        return tamanho == topo;
    }

    public boolean taVazio() {
        return tamanho == 0;
    }

    public T topo() {
        return (T) elementos[topo];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
