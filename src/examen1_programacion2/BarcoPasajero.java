/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_programacion2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adalb
 */
public final class BarcoPasajero extends Barco {
    public double precioBoleto;
    public int cantidadPasajeros=0;
    public String lista;
    public String[] nombres=new String[0];
    
    public BarcoPasajero(String nombre, Date fecha, double precioBoleto, int cantidadPasajeros) {
        super(nombre, fecha);
        this.precioBoleto=precioBoleto;
        this.cantidadPasajeros=cantidadPasajeros;
        nombres=new String[this.cantidadPasajeros];
    }
    
    public void agregarElemento(String nombre){
        for(int indice=0;indice<nombres.length;indice++){
            if(nombres[indice]!=null){
                nombres[indice]=nombre;
            }
        }
    }
    
    public double vaciarCobrar(int cantidadPasajeros, double precioBoleto){
        for(int indice=0;indice<pecesCapturados;indice++){
            return precioBoleto;
        }
        return 0;
    }
    
    public double precioElemento(String tipo, double precioBoleto){
        return precioBoleto;
    }
    
    public String toString(){
        return "Cantidad de Pasajeros que compraron boleto: #"+cantidadPasajeros;
    }
    
    public void listarPasajeros(int indice){
        if(indice<nombres.length){
            String lista=nombres[indice];
        }
    }
}
