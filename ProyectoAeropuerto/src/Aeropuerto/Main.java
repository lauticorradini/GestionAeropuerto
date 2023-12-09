package Aeropuerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    final static int num = 4;   //Numero de aeropuertos actuales
    static List<Aeropuerto> lstAeropuertos = new ArrayList<Aeropuerto>(num);

    public static void main(String[] args){
        insertarDatosAeropuertos(lstAeropuertos);
        menu();
    }

    public static void insertarDatosAeropuertos(List<Aeropuerto> aeropuerto){
        aeropuerto.add(0,new AeropuertoPublico("Aeroparque Jorge Newbery","Buenos Aires", "Argentina",80000));
        aeropuerto.get(0).insertarCompañia(new Compañia("Aerolineas Argentinas"));
        aeropuerto.get(0).insertarCompañia(new Compañia("Sky Airlines"));
        aeropuerto.get(0).insertarCompañia(new Compañia("LATAM"));
        aeropuerto.get(0).getCompañia("Aerolineas Argentinas").insertarVuelo(new Vuelo("AR1698", "Buenos Aires", "San Carlos de Bariloche", 120800.60, 150));
        aeropuerto.get(0).getCompañia("Aerolineas Argentinas").insertarVuelo(new Vuelo("AR1698", "Buenos Aires", "San Carlos de Bariloche", 187000, 200));
        aeropuerto.get(0).getCompañia("Aerolineas Argentinas").insertarVuelo(new Vuelo("AR1602", "Buenos Aires", "Mar del Plata", 90000, 50));
        aeropuerto.get(0).getCompañia("Sky Airlines").insertarVuelo(new Vuelo("SKU508", "Buenos Aires", "Santiago", 275900, 150));
        aeropuerto.get(0).getCompañia("LATAM").insertarVuelo(new Vuelo("JJ8143", "Buenos Aires", "Rio de Janeiro", 370000, 200));
        aeropuerto.get(0).getCompañia("LATAM").insertarVuelo(new Vuelo("JJ8083", "Buenos Aires", "San Pablo-Guarulhos", 330000, 200));
        aeropuerto.get(0).getCompañia("Aerolineas Argentinas").getVuelo("AR1602").insertarPasajero(new Pasajero("Lautaro Corradini", "argentina", "42586804"));
        aeropuerto.get(0).getCompañia("Aerolineas Argentinas").getVuelo("AR1698").insertarPasajero(new Pasajero("Neymar Junior", "brasileña", "10072021"));
        aeropuerto.get(0).getCompañia("Sky Airlines").getVuelo("SKU508").insertarPasajero(new Pasajero("Mauricio Isla", "chilena", "12061988"));
        aeropuerto.get(0).getCompañia("LATAM").getVuelo("JJ8143").insertarPasajero(new Pasajero("Frank Fabra", "colombiana", "00000000"));
        aeropuerto.get(0).getCompañia("LATAM").getVuelo("JJ8083").insertarPasajero(new Pasajero("Juan Perez", "argentina", "15241875"));

        aeropuerto.add(1,new AeropuertoPublico("Aeropuerto Ministro Pistarini","Buenos Aires", "Argentina",100000));
        aeropuerto.get(1).insertarCompañia(new Compañia("KLM"));
        aeropuerto.get(1).insertarCompañia(new Compañia("Iberia"));
        aeropuerto.get(1).insertarCompañia(new Compañia("American Airlines"));
        aeropuerto.get(1).getCompañia("KLM").insertarVuelo(new Vuelo("KLM702", "Buenos Aires", "Amsterdam", 530000, 300));
        aeropuerto.get(1).getCompañia("KLM").insertarVuelo(new Vuelo("KLM705", "Buenos Aires", "Amsterdam", 770000, 200));
        aeropuerto.get(1).getCompañia("Iberia").insertarVuelo(new Vuelo("IB6856", "Buenos Aires", "Madrid", 510000, 280));
        aeropuerto.get(1).getCompañia("American Airlines").insertarVuelo(new Vuelo("AA900", "Buenos Aires", "Miami", 660000, 300));
        aeropuerto.get(1).getCompañia("American Airlines").insertarVuelo(new Vuelo("AA954", "Buenos Aires", "New York - JFK", 630000, 200));
        aeropuerto.get(1).getCompañia("KLM").getVuelo("KLM702").insertarPasajero(new Pasajero("Matias Fernandez", "chilena", "92004325"));
        aeropuerto.get(1).getCompañia("Iberia").getVuelo("IB6856").insertarPasajero(new Pasajero("Rodrigo De Paul", "argentina", "18122022"));
        aeropuerto.get(1).getCompañia("American Airlines").getVuelo("AA900").insertarPasajero(new Pasajero("Lionel Messi", "argentina", "00010000"));
        aeropuerto.get(1).getCompañia("American Airlines").getVuelo("AA900").insertarPasajero(new Pasajero("Antonella Rocuzzo", "argentina", "00011000"));
        aeropuerto.get(1).getCompañia("American Airlines").getVuelo("AA954").insertarPasajero(new Pasajero("Nicolas Perez", "argentina", "15242315"));

    }

    public static void menu(){
        String nombreAeropuerto, nombreCompañia, origen, destino;
        int opcion;
        Aeropuerto aeropuerto;
        Compañia compañia;
        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver Aeropuertos gestionados");
            System.out.println("2. Ver empresas o subvencion");
            System.out.println("3. Listar compañias de un Aeropuerto");
            System.out.println("4. Lista de vuelos por Compañia");
            System.out.println("5. Listar posibles vuelos desde un Origen hacia un Destino");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1: //ver aeropuertos
                    System.out.println("");
                    mostrarDatos(lstAeropuertos);
                    break;

                case 2: //ver empresas o subvencion correspondiente
                    System.out.println("");
                    mostrarPatricinio(lstAeropuertos);
                    break;

                case 3: //listas de compañias de un aeropuerto buscado
                    sc.nextLine();
                    System.out.println("\nIngrese el nombre del aeropuerto: ");
                    nombreAeropuerto = sc.nextLine();
                    aeropuerto = buscarAeropuerto(lstAeropuertos, nombreAeropuerto);
                    if (aeropuerto == null){
                        System.out.println("El aeropuerto a buscar no existe");
                    } else {
                        mostrarCompañias(aeropuerto);
                    }
                    break;

                case 4: //mostrar vuelos por compañia
                    sc.nextLine();
                    System.out.println("\nIngrese el nombre del aeropuerto: ");
                    nombreAeropuerto = sc.nextLine();
                    aeropuerto = buscarAeropuerto(lstAeropuertos, nombreAeropuerto);
                    if (aeropuerto == null){
                        System.out.println("El aeropuerto no existe");
                    } else {
                        System.out.println("\nIngrese el nombre de la compañia: ");
                        nombreCompañia = sc.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostrarVuelos(compañia);
                    }
                    break;

                case 5: //mostrar posibles vuelos de origen a destino
                    sc.nextLine();
                    System.out.println("\nIngrese la ciudad de Origen: ");
                    origen = sc.nextLine();
                    System.out.println("\nIngrese la ciudad de Destino: ");
                    destino = sc.nextLine();
                    mostrarVueloOrigenDestino(origen, destino, lstAeropuertos);
                    break;
                
                case 0: break;

                default: System.out.println("Opcion incorrecta, ingrese nuevamente");
            }
            System.out.println("");
        } while (opcion != 0);
    }

    public static void mostrarDatos(List<Aeropuerto> aeropuertos){
        for (int i = 0; i < aeropuertos.size(); i++){
            if (aeropuertos.get(i) instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos.get(i).getNombre());
                System.out.println("Ciudad: " + aeropuertos.get(i).getCiudad());
                System.out.println("Pais: " + aeropuertos.get(i).getPais());
            } else {
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: " + aeropuertos.get(i).getNombre());
                System.out.println("Ciudad: " + aeropuertos.get(i).getCiudad());
                System.out.println("Pais: " + aeropuertos.get(i).getPais());
            }
            System.out.println("");
        }
    }

    public static void mostrarPatricinio(List<Aeropuerto> aeropuertos){
        List<String> empresas;
        for (int i = 0; i < aeropuertos.size(); i++){
            if (aeropuertos.get(i) instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado: " + aeropuertos.get(i).getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos).getListaEmpresas();
                System.out.println("Empresas: ");
                for (int j = 0; j < empresas.size(); j++){
                    System.out.println(empresas.get(i));
                }
            } else {
                System.out.println("Aeropuerto Publico: " + aeropuertos.get(i).getNombre());
                System.out.println("Subvencion: " + ((AeropuertoPublico)aeropuertos.get(i)).getSubvencion());
            }
            System.out.println("");
        }
    }

    public static Aeropuerto buscarAeropuerto(List<Aeropuerto> aeropuertos, String nombre){
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        while ((!encontrado) && (i < aeropuertos.size())) {
            if (nombre.equals(aeropuertos.get(i).getNombre())){
                encontrado = true;
                aero = aeropuertos.get(i);
            }
            i++;
        }
        return aero;
    }

    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nLas compañias del " + aeropuerto.getNombre() + " son: ");
        for (int i = 0; i < aeropuerto.getNumCompañia(); i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }

    public static void mostrarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.println("\nLos vuelos de la compañia " + compañia.getNombre() + " son: ");
        for (int i = 0; i < compañia.getNumerosVuelos(); i++){
            vuelo = compañia.getVuelo(i);
            System.out.println("");
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Origen: " + vuelo.getCiudadOrigen());
            System.out.println("Destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: $" + vuelo.getPrecio());
            System.out.println("");
        }
    }

    public static List<Vuelo> buscarVuelosOrigenDestino(String origen, String destino, List<Aeropuerto> aeropuertos){
        Vuelo vuelo;
        int contador = 0;
        List<Vuelo> listaVuelos;
        for (int i = 0; i < aeropuertos.size(); i++){       //recorre los aeropuertos
            for (int j = 0; j < aeropuertos.get(i).getNumCompañia(); j++){      //recorre las compañias
                for (int v = 0; v < aeropuertos.get(i).getCompañia(j).getNumerosVuelos(); v++){     //recorre los vuelos
                    vuelo = aeropuertos.get(i).getCompañia(j).getVuelo(v);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                    }
                }
            }
        }
        
        listaVuelos = new ArrayList<Vuelo>(contador);
        int q = 0;
        for (int i = 0; i < aeropuertos.size(); i++){
            for (int j = 0; j < aeropuertos.get(i).getNumCompañia(); j++){
                for (int k = 0; k < aeropuertos.get(i).getCompañia(j).getNumerosVuelos(); k++){
                    vuelo = aeropuertos.get(i).getCompañia(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos.add(q, vuelo);
                        q++;
                    }
                }
            }
        }
        return listaVuelos;
    }
    
    public static void mostrarVueloOrigenDestino(String origen, String destino, List<Aeropuerto> aeropuertos){
        List<Vuelo> vuelos;
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if (vuelos.size() == 0){
            System.out.println("No existen vuelos de esa ruta");
        } else {
            System.out.println("");
            System.out.println("Vuelos encontrados: ");
            System.out.println("");
            for (int i = 0; i < vuelos.size(); i++){
                System.out.println("Identificador: " + vuelos.get(i).getIdentificador());
                System.out.println("Origen: " + vuelos.get(i).getCiudadOrigen());
                System.out.println("Destino: " + vuelos.get(i).getCiudadDestino());
                System.out.println("Precio: $" + vuelos.get(i).getPrecio());
                System.out.println("");
            }
        }
    }
}
