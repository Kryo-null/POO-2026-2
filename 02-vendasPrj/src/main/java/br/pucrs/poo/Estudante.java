package br.pucrs.poo;

public class Estudante extends ClientePF {
    private String instituicao;

    public Estudante(int umCodigo, String umNome, String umCPF, String instituicao){
        super(umCodigo, umNome, umCPF);
        this.instituicao = instituicao;
    }


public String getInstituicao() { return instituicao; }}
