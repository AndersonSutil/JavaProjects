/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transsim;

/**
 *
 * @author senai
 */
public abstract class Auto implements Metodos{
    
    protected String modelo,cor,rodas;
    protected int vMax,nMar,capT,kmR,cusT;
    protected boolean sTatus;

    public Auto(boolean sTatus) {
        this.sTatus = sTatus;
    }

    public Auto(String modelo, String cor, String rodas, int vMax, int nMar, int capT,int kmR,int cusT) {
        this.modelo = modelo;
        this.cor = cor;
        this.rodas = rodas;
        this.vMax = vMax;
        this.nMar = nMar;
        this.capT = capT;
        this.kmR = kmR;
        this.cusT = cusT;
    }

    public boolean issTatus() {
        return sTatus;
    }

    public void setsTatus(boolean sTatus) {
        this.sTatus = sTatus;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public int getvMax() {
        return vMax;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
    }

    public int getnMar() {
        return nMar;
    }

    public void setnMar(int nMar) {
        this.nMar = nMar;
    }

    public int getCapT() {
        return capT;
    }

    public int getKmR() {
        return kmR;
    }

    public void setKmR(int kmR) {
        this.kmR = kmR;
    }

    public void setCapT(int capT) {
        this.capT = capT;
    }
    
    
    
    
}
