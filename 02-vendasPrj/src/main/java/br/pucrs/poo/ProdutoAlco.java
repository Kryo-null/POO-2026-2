package br.pucrs.poo;

public class ProdutoAlco extends Produto{
    private double taxa;

    public ProdutoAlco(int umCodigo, String umNome, double umPreco, int umaTaxa){
        super(umCodigo, umNome, umPreco);
        this.taxa = umaTaxa;
    }

    public double getTaxa(){
        return taxa;
    }

    public void setTaxa(double novaTaxa){
        this.taxa = novaTaxa;
    }

    @Override
    public double getPreco(){
        return super.getPreco() * (taxa/100);
    }
}
