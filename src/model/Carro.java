/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lukas.camargo
 */
public class Carro {

    private int idcarro;
    private String modelo;
    private int ano;
    private double valor;
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String pModelo){
        this.modelo = pModelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int pAno){
        this.ano = pAno;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double pValor){
        this.valor = pValor;
    }

    
     public Carro() {
    }

    public Carro(String modelo, int ano, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public Carro(int idcarro, String modelo, int ano, double valor) {
        this.idcarro = idcarro;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    public int getId(){
        return idcarro;
    }
    
    public void setId(int id){
        this.idcarro = id;
    }

}
