/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio7joedsosa;

/**
 *
 * @author joeds
 */
public class Avion {
     private String modeloAvion;
    private String codigoAvion;
    private int añoAvion;
    private int capacidadPasajeros;
    private int pesoAvion;
    private String aerolineaAvion;

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getAñoAvion() {
        return añoAvion;
    }

    public void setAñoAvion(int añoAvion) {
        this.añoAvion = añoAvion;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getPesoAvion() {
        return pesoAvion;
    }

    public void setPesoAvion(int pesoAvion) {
        this.pesoAvion = pesoAvion;
    }

    public String getAerolineaAvion() {
        return aerolineaAvion;
    }

    public void setAerolineaAvion(String aerolineaAvion) {
        this.aerolineaAvion = aerolineaAvion;
    }
    
    public String getEstadoAvion(int estado) {
        String estadoAvion="";
        switch (estado) {
            case 1:
              estadoAvion= "despegando";
              break;
            case 2:
              estadoAvion= "aterrizando";
              break;
            case 3:
              estadoAvion= "estacionado";
              break;
            default: estadoAvion= "error en estado";
        }
        return estadoAvion;
    }
}
