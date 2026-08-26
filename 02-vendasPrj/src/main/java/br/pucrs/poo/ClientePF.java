package br.pucrs.poo;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(int umCodigo, String umNome, String umCPF){
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }
}

public String getCPF(){
    return cpf;
}

@Override
public String toString(){
    //ficou ruim
    //return super.getCodigo() + super.getNome() + cpf;

    //reutilizando o toString de Cliente.java
    return super.toString() + " [cpf = " +cpf+ "]";
}
