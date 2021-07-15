/*
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete09;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        APIDisney api1 = new APIDisney();
        api2.establecerApiKey("dis0012");
        
        GeneradorPeliculas api1 = new GeneradorPeliculas();
        api1.establecerLlave(api3);
        api1.establecerUrl("http://api.movie?api=");
        System.out.println(api1.obtenerUrl());

        
        APIDisney api3 = new APIDisney();
        api2.establecerApiKey("dis0012");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp2.establecerLlave(api3);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());

    }
}
