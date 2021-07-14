/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author 0zzda
 */
public class TransporteAereo extends Transporte{
    private String cooperativaAerea;
    private Transporte tipotransporte;

    
    public void establecerCooperativaAerea(String n) {
        cooperativaAerea = n;
    }
    
    public void establecerTransporteAereo(Transporte n){
        tipotransporte=n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaAerea() {
        return cooperativaAerea;
    }
    
}
