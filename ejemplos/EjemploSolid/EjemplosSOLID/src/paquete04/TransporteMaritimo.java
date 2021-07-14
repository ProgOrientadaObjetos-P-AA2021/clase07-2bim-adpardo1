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
public class TransporteMaritimo extends Transporte{
    private String cooperativaMaritima;
    private Transporte tipotransporte;

    
    public void establecerCooperativaMaritima(String n) {
        cooperativaMaritima = n;
    }
    
    public void establecerTransporteMaritima(Transporte n){
        tipotransporte=n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaMaritima() {
        return cooperativaMaritima;
    }
}
