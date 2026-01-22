/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.util.ArrayList;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(ArrayList<ArrayList<Integer>> pedidos, int dia){
        
        int suma = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            suma = suma + pedidos.get(i).get(dia-1);
        }
        return suma;
    }
    
    public static String obtenerCafeteriaMasPedidos(ArrayList<ArrayList<Integer>> pedidos, ArrayList<String> cafeterias){
        
        ArrayList<Integer> sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal.get(0);
        int indice = 0;
        for (int i = 0; i < sumaSemanal.size(); i++) {
            int valor = sumaSemanal.get(i);
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias.get(indice);
        
    }
    
    public static ArrayList<Integer> obtenerMenorPedidoCafeteria(ArrayList<ArrayList<Integer>> pedidos){
        ArrayList<Integer> pedidosMenores = new ArrayList<>();
        
        for (int i = 0; i < pedidos.size(); i++) {
            pedidosMenores.add(Operacion.obtenerMenor(pedidos.get(i)));
        }
        
        return pedidosMenores;
    
    }
    
    public static ArrayList<Integer> obtenerMayorPedidoCafeteria(ArrayList<ArrayList<Integer>> pedidos){
        
        ArrayList<Integer> pedidosMayores = new ArrayList<>();
        
        for (int i = 0; i < pedidos.size(); i++) {
            pedidosMayores.add(Operacion.obtenerMayor(pedidos.get(i)));
        }
        
        return pedidosMayores;
    }
    
    
    
}
