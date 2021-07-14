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
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("COOP 2");
        taxi.establecerTarifa();
        
        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerCooperativaTransvia("COOP 3");
        t3.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaAerea("COOP 4");
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerCooperativaMaritima("COOP 5");
        mar.establecerTarifa();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.obtenerPromedioTarifas();
        tipos.establecerTransportes(lista);
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