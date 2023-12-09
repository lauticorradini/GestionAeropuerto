package Aeropuerto;
public class Pasajero {
    private String nombre;
    private String nacionalidad;
    private String pasaporte;

    public Pasajero(String nombre, String nacionalidad, String pasaporte){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pasaporte = pasaporte;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPasaporte() {
        return pasaporte;
    }
    
}
