package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author reroes
 */

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
        
        String [] misCafeterias = Establecimiento.obtenerCafeterias();
        /*
        Dentro de plantemiento de la solucion se pide que los datos deben ser
        todos ingresados por teclado lo cual no se cumple aqui
        */
        
        int [][] misPedidos = Pedido.obtenerPedidos();
        /*
        Para obetner los pedidos se crea un arreglo bidimensional que almacene
        los valores que van a ser retornados por la funcion obtenerPedidos
        los cuales ya estan ya estan establecidos dentro de obtenerPedidos
        */
        String [] misSedes = Ubicacion.obtenerUbicaciones();
        /*
        Para obtener las sedes tambien creamos un arreglo de tipo cadena unidimensional
        el cual va a almacenar todos los valores retornador por la funcion
        obtenerUbicacion
        */
        double [] promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);
        /*
        Para obtener los promedios semanales de cada cafeteria tendremos que enviar
        como argumentos el arreglo que almacena todos los pedidos donde la funcion
        va a sacar el promedio y  almacenar todo en un arreglo unidimensional
        que va a retornar los promedios de cada cafeteria
        */
        
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);
        
        /*
        Para obtener el total del dia unicamente esta contabilzando 3 dias haciendo
        referencia al dia miercoles que se pide dentro de la solucion lo que que
        hace que en el ciclo for tengamos que restar -1 en vez de +1 para que
        se pueda acceder a la columna correcta
        */
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);
        /*
        Para obtener la suma de pedidos total envio como argumento mi arreglo de
        enteros que ccontiene todos los pedidos donde dentro de la funcion se 
        sumaran y me retornara la suma de todos los pedidos
        */
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);
        /*
       Creo que una variable de tipo cadena la cual va a almacenar la cafeteria
        con mas pedidos comparando los promedios semanales los cuales me ayudaran
        a determinar cual fue la cafeteria con mayor pedidos
        */
        int [] pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);
        /*
        Para determinar cual fue la cafeteria con el numero menor de pedidos 
        enviare como arugmento todos los pedidos donde dentro de la funcion 
        encargada de determinar cual es la posicion con el menor numero de 
        pedidos mediante un ciclo for para finalmente ser retornada
        */
        int [] pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);
        /*
        Al igual que la funcion obtenerMenorPedidoCafeteria enviare como argumento
        los pedidos los cuales dentro de la funcion dependiendo de la posicion
        con menor numero de pedidos sera retornada 
        */
        Reporte.imprimirReporte(misCafeterias, misSedes, 
                promedioSemanal, 
                pedidosMenores, 
                pedidosMayores, 
                pedidosMiercoles, 
                cafeteriaMasPedida);
        /*
        Para imprimir el reporte de todas las cafeterias enviare como argumentos
        el arreglo de las cafeterias el arreglo de las sedes los promedios semanales 
        el arreglo con la cafeteria con el menor numero de pedidos y la cafeteria
        con el mayor numero de pedidos ademas de los pedidos de cada cafeteria
        del dia miercoles ademas de la cafeteria con mas pedidos y para imprimir 
        todo el reporte dentro de la funcion tengo que crear un ciclo for que vaya 
        almacenando todo dentro de un string format el cual sera el encargado de
        luego presentar toda la informacion
        */
    }
    
}
