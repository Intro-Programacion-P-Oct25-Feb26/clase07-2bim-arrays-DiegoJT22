/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Reporte {
    
    public static void imprimirReporte(ArrayList<String> cafeterias, ArrayList<String> sedes, 
            ArrayList<Double> promediosCaf, ArrayList<Integer> pedidosMenor, ArrayList<Integer> pedidosMayor, 
            int pedidosDia, String caferiaMasPedidos){
        String mensaje = "Listado de Cafeterías\n";
        
        for (int i = 0; i < cafeterias.size(); i++) {
            mensaje = String.format("%sCafetería: %s (Sede: %s), "
                    + "promedio de pedidos: %.2f, número menor de pedidos: %d, "
                    + "número mayor de pedidos: %d\n", 
            mensaje, 
            cafeterias.get(i), 
            sedes.get(i), 
            promediosCaf.get(i), 
            pedidosMenor.get(i), 
            pedidosMayor.get(i)
            );
        }
        
        mensaje = String.format("%s\nPedidos del día miércoles: %d\n", mensaje, pedidosDia);
        mensaje = String.format("%s\nCafeterías más pedidos: %s", mensaje, caferiaMasPedidos);
            
        System.out.printf("%s\n", mensaje);
    }
}
