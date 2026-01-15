/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import paquete02.DatoTrabajo;

/**
 *
 * @author ASUS
 */
public class Informe {

    public static void imprimir(String a, String b, String c, double d, double[] e) {
        String nombreDeEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        String direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        String mensaje = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Promedio: %.2f\n"
                + "Mis notas:\n",
                a,
                b,
                c,
                nombreDeEmpresa,
                direccionEmpresa,
                d);
        for (int i = 0; i < e.length; i++) {
            mensaje += String.format("%.2f\n", e[i]);
        }
        System.out.printf(mensaje);
    }

}
