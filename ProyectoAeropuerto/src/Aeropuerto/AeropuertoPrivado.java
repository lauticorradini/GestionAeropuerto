package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class AeropuertoPrivado extends Aeropuerto {
    private List<String> listaEmpresas = new ArrayList<String>();
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, ArrayList<Compañia> compañias, ArrayList<String> empresa){
        super(nombre, ciudad, pais, compañias);
        this.listaEmpresas = empresa;
        numEmpresa = empresa.size();
    }

    public void insertarEmpresas(ArrayList<String> empresas){
        this.listaEmpresas = empresas;
        this.numEmpresa = empresas.size();
    }

    public void insertarEmpresa(String empresa){
        this.listaEmpresas.add(empresa);
        this.numEmpresa++;
    }

    public List<String> getListaEmpresas(){
        return this.listaEmpresas;
    }

    public int getNumEmpresas(){
        return this.numEmpresa;
    }
}
