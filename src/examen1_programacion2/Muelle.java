/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_programacion2;

import static examen1_programacion2.Main.fechaCrear;
import static examen1_programacion2.Main.nombreCrear;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class Muelle {
    ArrayList<Barco> barcos=new ArrayList<>();
    public boolean puedeCrear;
    
    public void AgregarBarco(String tipo){
        for(int indice=0;indice<barcos.size();indice++){
            if(barcos.get(indice).getNombre().equals(nombreCrear)){
                puedeCrear=false;
                JOptionPane.showMessageDialog(null, "Este barco ya existe.");
            }else{
                puedeCrear=true;
            }
        }
        if(puedeCrear==true){
            if(tipo.equals("PESQUERO")){
                barcos.add(new BarcoPesquero(nombreCrear,fechaCrear,0,Barco.TipoPesquero.CAMARON));
            }else{
                barcos.add(new BarcoPasajero(nombreCrear,fechaCrear,0,0));
            }
        }
    }
    
    public void agregarElemento(String nombre){
        for(int indice=0;indice<barcos.size();indice++){
            if(barcos.get(indice).getNombre().equals(nombreCrear)){
                puedeCrear=false;
                JOptionPane.showMessageDialog(null, "Este barco ya existe.");
            }
        }
    }
    
    public void barcosDesde(int indice, Date year){
        if(indice<barcos.size()){
            if(barcos.get(indice).getFecha().before(year)){
                JOptionPane.showMessageDialog(null, barcos.get(indice).getNombre()+" Fecha de circulación: "+barcos.get(indice).getFecha());
            }
        }
    }
    
    public static void main(int llamar){
        
    }
    
}
