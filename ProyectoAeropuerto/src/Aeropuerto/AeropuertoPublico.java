package Aeropuerto;

import java.util.List;

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais, String codigo){
        super(nombre, ciudad, pais, codigo);
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, List<Compañia> compañia, double subvencion){
        super(nombre, ciudad, pais, compañia);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion, String codigo){
        super(nombre, ciudad, pais, codigo);
        this.subvencion = subvencion;
    }

    public double getSubvencion(){
        return this.subvencion;
    }
}
