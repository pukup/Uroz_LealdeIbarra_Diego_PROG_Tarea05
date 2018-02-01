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

    public AlquilerVehiculos() {
        turismos = new Turismo[MAX_TURISMOS];
        clientes = new Cliente[MAX_CLIENTES];
        alquileres = new Alquiler[MAX_ALQUILERES];
    }

    public Turismo[] getTurismos() {
        return turismos;
    }

    public Cliente[] getCLientes() {
        return clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public Cliente getCliente(Cliente cliente) {

        int encontrado = 0;
        for (Cliente cliente1 : clientes) {
            if (cliente.getNombre().equals(cliente1.getNombre())) {
                encontrado = 1;
            }
        }
        if (encontrado == 1) {
            return cliente;
        } else {
            return null;
        }

    }

    public void addCliente(Cliente cliente) {

        for (Cliente cliente1 : clientes) {
            if (cliente1 == null) {
                cliente1 = cliente;
            } else {
                throw new ExcepcionAlquilerVehiculos("No hay espacio disponible");
            }
        }
    }

}
