/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio7joedsosa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joeds
 */
public class Laboratorio7JoedSosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Scanner stc = new Scanner(System.in);
        String resp = "";
        do {
            System.out.println("Bienvenido al Laboratorio #7");
            System.out.println("Hola Memo, Hola Stephanie");
            System.out.println("Sleccione el Ejericio que desea revisar: ");
            System.out.println("1) El calamar Pablo");
            System.out.println("2) Torre de Control");
            int opciones = sc.nextInt();
            switch (opciones) {

                case 1:// llamar metodo
                {
                    System.out.println(" Bienvenido a el Ejercicio 1: El Calamar Pablo ");
                    Calamarsito();
                    break;
                }
                
                case 2: // llamar metodo
                {
                    System.out.println("Bienvenido a el Ejercicio 2: Torre de Control");
                    Ejercicio2();
                    break;
                }

            }
            System.out.println("Desea continuar S para continuar, cualquier otra tecla para salir!");
            resp = stc.nextLine();
        } while ("s".equalsIgnoreCase(resp) || "S".equalsIgnoreCase(resp));

    
    }
  public static void Ejercicio2()  {
      System.out.println("-- Bienvenido al sistema de torre de control --");
        List<Avion> aviones = new ArrayList<Avion>();
        for (int i = 0; i < 3; i++) {
            Avion avion = new Avion();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Ingrese el modelo del Avion "+(i+1)+" :");
            String modelo = sc1.nextLine();
            System.out.println("Ingrese el codigo del Avion "+(i+1)+" :");
            String codigo = sc1.nextLine();
            System.out.println("Ingrese el Año del Avion "+(i+1)+" :");
            int year = sc1.nextInt();
            System.out.println("Ingrese el capacidad maxima de pasajeros del Avion "+(i+1)+" :");
            int capacidadPasajeros = sc1.nextInt();
            System.out.println("Ingrese el peso del Avion "+(i+1)+" :");
            int peso = sc1.nextInt();
            Scanner sc0 = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la aerolinea del Avion "+(i+1)+" :");
            String aerolinea = sc0.nextLine();
            avion.setModeloAvion(modelo);
            avion.setCodigoAvion(codigo);
            avion.setAñoAvion(year);
            avion.setCapacidadPasajeros(capacidadPasajeros);
            avion.setPesoAvion(peso);
            avion.setAerolineaAvion(aerolinea);
            aviones.add(avion);
            System.out.println("-- Se ha agregado el avion exitosamente --");
        }
        boolean cambiarStatus=true;
        do {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Desea cambiar el estatus de un avion");
            System.out.println("[S/N]");
            String cambiarEstado = sc2.nextLine();
            if("s".equals(cambiarEstado) || "S".equals(cambiarEstado)){
                int i=1;
                System.out.println("Aviones disponibles");
                for (Avion avion : aviones) {
                    System.out.println(i+" "+avion.getModeloAvion());
                    i++;
                }
                System.out.println("Ingrese el numero del avion que desea cambiar el estado:");
                int nAvion = sc2.nextInt();
                if(nAvion>0 && nAvion<=3){
                    System.out.println("--- Se ha elejido el "+aviones.get(nAvion-1).getModeloAvion()+" ---");
                    System.out.println("1. Despegando");
                    System.out.println("2. Aterrizando");
                    System.out.println("3. Estacionado");
                    System.out.println("Ingrese el nuevo estado:");
                    int nStatus = sc2.nextInt();
                    System.out.println("--- "+aviones.get(nAvion-1).getModeloAvion()+" ahora esta "+aviones.get(nAvion-1).getEstadoAvion(nStatus)+" ---");
                }
            }else{
                cambiarStatus=false;
            }
            
            
       } while (cambiarStatus);
        
  }
  public static void Calamarsito(){
      List<Seleccion> selecciones = new ArrayList<Seleccion>();
        selecciones = setSeleccion(selecciones, "E", "Espana", "Luis Enrique", 26, "Si", "Primera", 0);
        selecciones = setSeleccion(selecciones, "E", "Alemania", "Hansi Flick", 26, "Si", "Tercera", 0);
        selecciones = setSeleccion(selecciones, "E", "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarta", 0);
        selecciones = setSeleccion(selecciones, "E", "Japon", "Hajime Moriyasu", 26, "No", "Segunda", 0);
        selecciones = setSeleccion(selecciones, "F", "Belgica", "Roberto Martinez", 26, "No", "Primera", 0);
        selecciones = setSeleccion(selecciones, "F", "Croacia", "Zlatko Dalic", 26, "No", "Segunda", 0);
        selecciones = setSeleccion(selecciones, "F", "Canada", "John Herdman", 26, "No", "Cuarta", 0);
        selecciones = setSeleccion(selecciones, "F", "Marruecos", "Walid Regragui", 26, "No", "Tercera", 0);
        boolean todasIngresadas=false;
        do {
            Locale loc = new Locale("es", "ES");
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.println("Ingrese el nombre de la seleccion:");
            String seleccionSelect = sc.nextLine();
            int i=0;
            for (Seleccion seleccion : selecciones) {
                if(seleccionSelect.equalsIgnoreCase(seleccion.getNombreSeleccion())){
                    selecciones.get(i).setIngresada(true);
                    System.out.println(seleccion.getNombreSeleccion()+" pertenece al grupo "+seleccion.getNombreGrupo());
                    System.out.println("Su director tecnico es "+seleccion.getDirectorTecnico());
                    System.out.println("Tiene "+seleccion.getJugadoresConvocados()+" jugadores convocados");
                    System.out.println(seleccion.getGanoMundial()+" ha ganado un mundial");
                    System.out.println("Esta en la "+seleccion.getPosTabla());
                }
                i++;
            }
            todasIngresadas = seleccionesIngresadas(selecciones);
       } while (!todasIngresadas);
        System.out.println("Resultado de los partidos:");
        System.out.println("___________________________");
        setSorteoPartidos(selecciones, 4, 3);
        System.out.println("___________________________");
        setSorteoPartidos(selecciones, 5, 8);
        System.out.println("___________________________");
        setSorteoPartidos(selecciones, 6, 7);
        System.out.println("___________________________");
        setSorteoPartidos(selecciones, 1, 2);
    }
    
       
    public static boolean seleccionesIngresadas(List<Seleccion> selecciones) {
        boolean ingresadas=true;
        for (Seleccion seleccion : selecciones) {
            if(!seleccion.isIngresada()){
                ingresadas=false;
                break;
            }
        }
        return ingresadas;
    }
    
    public static List<Seleccion> setSeleccion(List<Seleccion> selecciones,final String grupo, final String nonmbre, final String director, final int jugadores, final String haGanado, final String posicion, final int goles) {
        Seleccion seleccion = new Seleccion();
        seleccion.setNombreGrupo(grupo);
        seleccion.setNombreSeleccion(nonmbre);
        seleccion.setDirectorTecnico(director);
        seleccion.setJugadoresConvocados(jugadores);
        seleccion.setGanoMundial(haGanado);
        seleccion.setPosTabla(posicion);
        seleccion.setCantidadGoles(goles);
        selecciones.add(seleccion);
        return selecciones;
    }
    
    public static List<Seleccion> setSorteoPartidos(List<Seleccion> selecciones,final int equipo1, final int equipo2) {
        Seleccion seleccion1=selecciones.get(equipo1-1);
        seleccion1.setCantidadGoles(getGoles());
        Seleccion seleccion2=selecciones.get(equipo2-1);
        seleccion2.setCantidadGoles(getGoles());
        System.out.println("Juega "+seleccion1.getNombreSeleccion()+" contra "+seleccion2.getNombreSeleccion());
        System.out.println(seleccion1.getNombreSeleccion()+" "+seleccion1.getCantidadGoles()+" / "+seleccion2.getNombreSeleccion()+" "+seleccion2.getCantidadGoles());
        if(seleccion1.getCantidadGoles()!=seleccion2.getCantidadGoles()){
            if(seleccion1.getCantidadGoles()>seleccion2.getCantidadGoles()){
                System.out.println("¡ha ganado "+seleccion1.getNombreSeleccion()+"!");
            }else{
                System.out.println("¡ha ganado "+seleccion2.getNombreSeleccion()+"!");
            }
        }else{
            System.out.println("¡han quedado empate!");
        }
        return selecciones;
    }
    
    public static int getGoles() {
        Random r = new Random();
        int golAleatorio = r.nextInt(5)+1;
        return golAleatorio;
    }
  }

