/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

/**
 *
 * @author lol
 */
public class AlquilerVehiculos {
    
    private final int MAX_TURISMOS = 10;
    private final int MAX_CLIENTES = 50;
    private final int MAX_ALQUILERES = 10;
    private Turismo[] turismos;
    private Cliente[] clientes;
    private Alquiler[] alquileres;
    
    public AlquilerVehiculos(){
        turismos = new Turismo[MAX_TURISMOS];
        clientes = new Cliente[MAX_CLIENTES];
        alquileres = new Alquiler[MAX_ALQUILERES];
    }
}
