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
public class TransporteTransvia extends Transporte{
    private String cooperativaTransvia;
    private Transporte tipotransporte;

        
    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }
    
    public void establecerTransporteTransvia(Transporte n){
        tipotransporte=n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }
}
