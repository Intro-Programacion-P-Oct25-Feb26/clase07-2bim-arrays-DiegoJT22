package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author reroes
 */

import java.util.ArrayList;
import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> misCafeterias = Establecimiento.obtenerCafeterias();
        ArrayList<ArrayList<Integer>> misPedidos = Pedido.obtenerPedidos();
        ArrayList<String> misSedes = Ubicacion.obtenerUbicaciones();
        ArrayList<Double> promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        ArrayList<Integer> pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        ArrayList<Integer> pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        Reporte.imprimirReporte(misCafeterias, misSedes, 
                promedioSemanal, 
                pedidosMenores, 
                pedidosMayores, 
                pedidosMiercoles, 
                cafeteriaMasPedida);
    }
    
}
