package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class Compañia {
    private String nombre;
    private List<Vuelo> listaVuelos = new ArrayList<>();
    private int numVuelo = 0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, List<Vuelo> vuelo) {
        this.nombre = nombre;
        this.listaVuelos = vuelo;
        this.numVuelo = vuelo.size();
    }

    public void insertarVuelo(Vuelo vuelo) {
        this.listaVuelos.add(vuelo);
        this.numVuelo++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumerosVuelos() {
        return this.numVuelo;
    }

    public Vuelo getVuelo(int i){
        return this.listaVuelos.get(i);
    }

    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null;
        while ((!encontrado) && (i < listaVuelos.size())){
            if (id.equals(this.listaVuelos.get(i).getIdentificador())){
                encontrado = true;
                v = this.listaVuelos.get(i);
            }
            i++;
        }
        return v;
    }
}
