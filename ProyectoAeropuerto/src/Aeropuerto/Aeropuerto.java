package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private List<Compañia> listaCompañias = new ArrayList<>();
    private int numCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, List<Compañia> listaCompañias) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompañias = listaCompañias;
        this.numCompañia = listaCompañias.size();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getPais() {
        return this.pais;
    }

    public List<Compañia> getListaCompañias() {
        return this.listaCompañias;
    }

    public int getNumCompañia() {
        return this.numCompañia;
    }

    public void insertarCompañia(Compañia compañia){
        this.listaCompañias.add(compañia);
        this.numCompañia++;
    }

    public Compañia getCompañia(int i){
        return this.listaCompañias.get(i);
    }

    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i = 0;
        Compañia c = null;
        while ((!encontrado) && i < this.listaCompañias.size()){
            if (this.listaCompañias.get(i).getNombre().equals(nombre)){
                encontrado = true;
                c = this.listaCompañias.get(i);
            }
            i++;
        }
        return c;
    }

    
}
