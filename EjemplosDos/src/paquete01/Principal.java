/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Informe;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        Informe.imprimir(nombre, apellidoRetornado, ciudad, promedio, misNotas);
        
    }
    
}
/*
Solicitar datos de a una persona (nombre, apellido, ciudad, y 3 notas), y se 
saca un promedio las cuales van a ser realizadas por diferentes clases por un 
import, en estas clases se van a realizar funciones las cuales van a ser 
devuetlas al principal luego se presentar un reporte de los datos ingresados, 
junto con el promedio
*/