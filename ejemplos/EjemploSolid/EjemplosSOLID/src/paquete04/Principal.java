/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;
import paquete04.*;

/**
 *
 * @author reroes
 */

public class Principal {
    public static void main(String[] args) {
        ArrayList transportes = null;
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        transportes.add(bus);
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        transportes.add(taxi);
        
        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerCooperativaTransvia("COOP 1");
        t3.establecerTarifa();
        transportes.add(t3);
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaAerea("COOP 2");
        aereo.establecerTarifa();
        transportes.add(aereo);
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerCooperativaMaritima("COOP 3");
        mar.establecerTarifa();
        transportes.add(mar);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerPromedioTarifas();

        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
/*
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}
*/