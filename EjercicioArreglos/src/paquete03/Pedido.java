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
public class Pedido {

    public static ArrayList<ArrayList<Integer>> obtenerPedidos() {

        ArrayList<ArrayList<Integer>> pedidosCafeterias = new ArrayList<>();

        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(120, 130, 125, 140, 135, 150, 145)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(150, 155, 160, 170, 165, 175, 180)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(200, 210, 205, 215, 220, 225, 230)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(260, 255, 265, 270, 275, 280, 285)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(280, 275, 285, 290, 295, 300, 305)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(290, 195, 200, 205, 210, 215, 220)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(240, 245, 250, 260, 255, 265, 200)
        ));
        pedidosCafeterias.add(new ArrayList<>(
                Arrays.asList(305, 310, 305, 315, 320, 302, 340)
        ));

        return pedidosCafeterias;
    }

}
