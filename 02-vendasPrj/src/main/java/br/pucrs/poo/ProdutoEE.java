package br.pucrs.poo;
import java.time.LocalDate;

public class ProdutoEE extends Produto {
    private int garantia;
    private LocalDate dataCompra = LocalDate.now();

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int umaGarantia) {
        super(umCodigo, umNome, umPreco);
        this.garantia = umaGarantia;
    }

    public String getGarantia() {  //fiz do jeito que consegui (n entendi direito como fazer da mlehor forma)
        String resultado;
        resultado = "nome: " + super.getNome();
        resultado += "garantia: " + garantia + " dias";
        resultado += "data da compra: " + this.dataCompra;
        resultado += "vencimento: " + dataCompra.plusDays(garantia);
        return resultado;
    }
}

