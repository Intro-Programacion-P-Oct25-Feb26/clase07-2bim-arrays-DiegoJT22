/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Establecimiento {
    
    public static ArrayList<String>  obtenerCafeterias(){
        ArrayList<String> cafeterias = new ArrayList<>(
        Arrays.asList(
            "Café Andino", "Café Pacífico", "Café Sierra", "Café Amazónico", 
            "Café Central", "Café Jardín", "Café Tec", "Café Rectorado"
            )
        );
        
        return cafeterias;
    
    }
}
