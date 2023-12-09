package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private List<Pasajero> listaPasajeros;

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new ArrayList<Pasajero>(numMaxPasajeros);
    }

    public void insertarPasajero(Pasajero pasajero) {
        this.listaPasajeros.add(pasajero);
        this.numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public Pasajero getPasajero(int i) {
        return listaPasajeros.get(i);
    }

    public Pasajero getPasajero(String pasaporte) {
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;
        while ((!encontrado) && (i < this.numMaxPasajeros)) {
            if (pasaporte.equals(this.listaPasajeros.get(i).getPasaporte())) {
                encontrado = true;
                pas = this.listaPasajeros.get(i);
            }
            i++;
        }
        return pas;
    }

}
