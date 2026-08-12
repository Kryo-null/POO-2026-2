package br.pucrs.poo;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda(Cliente cli) {
        this.cliente = cli;
        this.itens = new ArrayList<>();
    }

    public void inserir(Produto prod) {
        // TODO
    }

    public void inserir(int qtde, Produto prod) {
        // TODO
    }

    public String getNotaFiscal() {
        return " TODO ";
    }

    @Override
    public String toString() {
        return "Venda [cliente=" + cliente + ", itens=" + itens + "]";
    }

}
