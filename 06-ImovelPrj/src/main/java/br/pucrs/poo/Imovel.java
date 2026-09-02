package br.pucrs.poo;

public abstract class Imovel{

    private String proprietario;
    private int areaConstruida;
    private double latitude;
    private double longitude;

    public Imovel(String umProprietario, int umaArea, double umaLatitude, double umaLongitude){
        this.proprietario = umProprietario;
        this.areaConstruida = umaArea;
        this.latitude = umaLatitude;
        this.longitude = umaLongitude;
    }

    public String getProprietario(){
        return proprietario;
    }


}
