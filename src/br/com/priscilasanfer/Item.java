package br.com.priscilasanfer;

public class Item {
    private String nome;
    private int quantidade;
    private int valor;

    public Item(String nome, int quantidade, int valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getValor() {
        return valor;
    }

}
