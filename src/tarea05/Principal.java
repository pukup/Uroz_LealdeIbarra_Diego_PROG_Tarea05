/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import utilidades.Entrada;

/**
 *
 * @author lol
 */
public class Principal {

    public static void main(String args[]) {

        int seleccion = 0;
        while (seleccion < 0 || seleccion > 10) {
            System.out.printf("Seleccione una opción. %n 1. Añadir cliente. %n 2. Borrar cliente. %n 3. Listar clientes. %n 4. Añadir turismo. %n 5. Borrar turismo. %n 6. Listar turismos. %n 7. Abrir alquiler. %n 8. Cerrar Alquiler. %n 9. Listar alquileres. %n 10. Salir. %n");
            seleccion = Entrada.entero();
        }
        while (seleccion != 0) {          
            seleccion = Entrada.entero();
        switch (seleccion) {
                case 1:                  
                    System.out.println("Nombre: ");
                    String nombre = Entrada.cadena();
                    System.out.println("Dirección: ");
                    String direccion = Entrada.cadena();
                    System.out.println("Localidad: ");
                    String localidad = Entrada.cadena();
                    System.out.println("Código postal: ");
                    String codigoPostal = Entrada.cadena();
                    Cliente cliente = new Cliente(nombre, direccion, localidad, codigoPostal);
                case 2:
                    System.out.println("2. Borrar cliente.");
                case 3:
                    System.out.println("3. Listar clientes.");
                case 4:
                    System.out.println("4. Añadir turismo.");
                case 5:
                    System.out.println("5. Borrar turismo.");
                case 6:
                    System.out.println("6. Listar turismos.");
                case 7:
                    System.out.println("7. Abrir alquiler.");
                case 8:
                    System.out.println("8. Cerrar Alquiler.");
                case 9:
                    System.out.println("9. Listar alquileres.");
                case 10:
                    System.out.println("10. Salir.");
            }

    }

}