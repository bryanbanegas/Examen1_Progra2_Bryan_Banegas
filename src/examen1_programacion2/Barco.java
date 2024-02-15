/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_programacion2;

import java.util.Date;

/**
 *
 * @author adalb
 */
public abstract class Barco {
    public String nombre; 
    public Date fecha=new Date();
    
    public Barco(String nombre, Date hoy){
        this.nombre=nombre;
        this.fecha=fecha;
    }
    
    public final String getNombre(){
        return nombre;
    }
    
    public final Date getFecha(){
        return fecha;
    }
    
    public String toString(){
        return "Nombre de barco: "+nombre;
    }
    
    public abstract void agregarElemento(String nombre);
    
    public abstract double vaciarCobrar(int pecesCapturados, double precio);
    
    public abstract double precioElemento(String tipo, double precio);
    
    public static enum TipoPesquero{
        PEZ(1.0), CAMARON(2.0), LANGOSTA(3.0);
        private final double price;
        
        private TipoPesquero(double price){
            this.price=price;
        }

        public double getPrice(){
           return price;
        }
    }
}
