package Aeropuerto;

import java.util.List;

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais){
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, List<Compañia> compañia, double subvencion){
        super(nombre, ciudad, pais, compañia);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion){
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion(){
        return this.subvencion;
    }
}
