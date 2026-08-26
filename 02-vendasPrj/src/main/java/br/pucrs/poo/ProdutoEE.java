package br.pucrs.poo;

public class ProdutoEE extends Produto {
    private int garantia;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int umaGarantia) {
        super(umCodigo, umNome, umPreco);
        this.garantia = umaGarantia;
    }
}

