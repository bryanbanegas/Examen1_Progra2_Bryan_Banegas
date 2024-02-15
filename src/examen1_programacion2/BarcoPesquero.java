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
public class BarcoPesquero extends Barco {
    public int pecesCapturados=0;
    public TipoPesquero tipo;
    ArrayList<BarcoPesquero> peces=new ArrayList<>();

    public BarcoPesquero(String nombre, Date fecha, int pecesCapturados, TipoPesquero tipo) {
        super(nombre, fecha);
        this.pecesCapturados=pecesCapturados;
        this.tipo=tipo;
    }
    
    public void agregarElemento(String nombre){
        pecesCapturados++;
    }
    
    public double vaciarCobrar(int pecesCapturados, double precio){
        for(int indice=0;indice<pecesCapturados;indice++){
            return precio;
        }
        return 0;
    }
    
    public double precioElemento(String tipo, double precio){
        if(tipo.equals("PEZ")){
            return precio=TipoPesquero.PEZ.getPrice();
        }else if(tipo.equals("CAMARON")){
            return precio=TipoPesquero.CAMARON.getPrice();
        }else if(tipo.equals("LANGOSTA")){
            return precio=TipoPesquero.LANGOSTA.getPrice();
        }else{
            return 0;
        }
    }
    
    public String toString(){
        return "Nombre de barco: "+nombre;
    }
    
                                        
}
