/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete04.TransporteBus;
import paquete04.TransporteTaxi;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private ArrayList<Transporte> transportes; // puedo tener muchos tipos de Transporte
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    
    public void establecerTransportes(ArrayList<Transporte> t){
        transportes = t;
    }
    
    public ArrayList<Transporte> obtenerTransportes(){
        return transportes;
    }
    public void establecerTransporteTaxi(TransporteTaxi taxi){
        ttaxi = taxi;
    }
    
    public void establecerTransporteBus(TransporteBus bus){
        ttbus = bus;
    }
    
    public TransporteTaxi obtenerTransporteTaxi(){
        return ttaxi;
    }
    
    public TransporteBus obtenerTransporteBus(){
        return ttbus;
    }
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
}
