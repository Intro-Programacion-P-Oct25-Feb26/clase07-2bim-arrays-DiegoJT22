/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static ArrayList<Double> obtenerPromedioSemanal(ArrayList<ArrayList<Integer>> pedidos) {
        
        ArrayList<Double> promedios = new ArrayList<>();
        
        int suma;
        double promedio;
        
        for (int i = 0; i < pedidos.size(); i++) {
            suma = 0;
            for (int j = 0; j < pedidos.get(i).size(); j++) {
                suma = suma + pedidos.get(i).get(j);
            }
            promedio = (double) suma / 7;
            promedios.add(promedio);
        }

        return promedios;
    }

    public static int obtenerSumaTotal(ArrayList<ArrayList<Integer>> pedidos) {

        int suma = 0;
        for (int i = 0; i < pedidos.size(); i++) {

            for (int j = 0; j < pedidos.get(i).size(); j++) {
                suma = suma + pedidos.get(i).get(j);
            }

        }

        return suma;
    }

    public static ArrayList<Integer> obtenerSumaSemanal(ArrayList<ArrayList<Integer>> pedidos) {
        ArrayList<Integer> sumaSemanal = new ArrayList<>();
        int suma;
        for (int i = 0; i < pedidos.size(); i++) {
            suma = 0;
            for (int j = 0; j < pedidos.get(i).size(); j++) {
                suma = suma + pedidos.get(i).get(j);
            }
            sumaSemanal.add(suma);
        }

        return sumaSemanal;
    }

    public static int obtenerMenor(ArrayList<Integer> pedidosCafeteria) {
        int menor = pedidosCafeteria.get(0);
        int valor;
        for (int i = 0; i < pedidosCafeteria.size(); i++) {
            valor = pedidosCafeteria.get(i);
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static int obtenerMayor(ArrayList<Integer> pedidosCafeteria) {
        int mayor = pedidosCafeteria.get(0);
        int valor;
        for (int i = 0; i < pedidosCafeteria.size(); i++) {
            valor = pedidosCafeteria.get(i);
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

}
