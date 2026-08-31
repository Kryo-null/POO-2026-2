package br.pucrs.poo;

public class ClientePF extends Cliente {
  private String cpf;

  public ClientePF(int umCodigo, String umNome, String umCPF) {
    super(umCodigo, umNome);
    this.cpf = umCPF;
  }

  @Override
  public String getID(){
    return this.cpf;
  }

  public String getCPF() { return this.cpf; }

  @Override
  public String toString() {
    // ficou feio...
    //return super.getCodigo() + super.getNome() + "[cpf=" + cpf + "]";

    // reutilizando o toString da Classe Cliente
    return super.toString() + " [cpf = " + this.cpf + "]";
  }



}
