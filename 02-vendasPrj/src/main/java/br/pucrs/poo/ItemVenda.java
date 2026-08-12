package br.pucrs.poo;

public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int qtde, Produto umProd) {
        this.quantidade = qtde;
        this.prod = umProd;
    }

    @Override
    public String toString() {
        return "ItemVenda [quantidade=" + quantidade + ", prod=" + prod + "]";
    }

}
