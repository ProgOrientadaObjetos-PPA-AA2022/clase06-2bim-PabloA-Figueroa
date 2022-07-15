/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        Enlace c = new Enlace();
        int cont = 0;
        while (bandera) {            
            cont += 1 ; 
            System.out.println("Ingeso de datos N°" + cont);
            System.out.println("Ingrese el nombre de la ciudad");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la poblacion");
            int poblacion = entrada.nextInt();
            Ciudad ciudad = new Ciudad(nombre, poblacion);
            c.insertarCiudad(ciudad);
            entrada.nextLine();
            System.out.println("Ingrese SI para salir del programa");
            String condicion = entrada.nextLine();
            if (condicion.equals("Si") || condicion.equals("SI")) {
                bandera = false;
            }
        }


        /*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }*/
    }
}
