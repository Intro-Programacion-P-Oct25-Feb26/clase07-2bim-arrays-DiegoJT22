/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Ubicacion {
    
    public static ArrayList<String> obtenerUbicaciones(){
        ArrayList<String> sedes = new ArrayList<>(
        Arrays.asList(
            "Bloque A - Biblioteca", "Bloque B - Laboratorios", 
            "Bloque C - Aulas", "Bloque D - Administración", 
            "Bloque E - Deportes", "Bloque F - Residencias", 
            "Bloque G - Ingeniería", "Bloque H - Rectorado"
            )
        );
        return sedes;
    }
}
