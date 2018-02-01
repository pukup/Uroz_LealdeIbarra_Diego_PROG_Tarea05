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
        for (Cliente clienteArray : clientes) {
            if (cliente.getNombre().equals(clienteArray.getNombre())) {
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

        for (Cliente clienteArray : clientes) {
            if (clienteArray == null) {
                clienteArray = cliente;
            } else {
                throw new ExcepcionAlquilerVehiculos("No hay espacio disponible.");
            }
        }
    }

    public void delCliente(Cliente cliente) {
        for (Cliente clienteArray : clientes) {
            if (cliente.getNombre().equals(clienteArray.getNombre())) {
                clienteArray = null;
            } else {
                throw new ExcepcionAlquilerVehiculos("No se ha encontrado el cliente.");
            }
        }
    }

    public Turismo getTurismo(Turismo turismo) {
        int encontrado = 0;
        for (Turismo turismoArray : turismos) {
            if (turismo.getMatricula().equals(turismoArray.getMatricula())) {
                encontrado = 1;
            }
        }
        if (encontrado == 1) {
            return turismo;
        } else {
            return null;
        }
    }

    public void addTurismo(Turismo turismo) {
        for (Turismo turismoArray : turismos) {
            if (turismoArray == null) {
                turismoArray = turismo;
            } else {
                throw new ExcepcionAlquilerVehiculos("No hay espacio disponible.");
            }
        }
    }

    public void delTurismo(Turismo turismo) {
        for (Turismo turismoArray : turismos) {
            if (turismo.getMatricula().equals(turismoArray.getMatricula())) {
                turismoArray = null;
            } else {
                throw new ExcepcionAlquilerVehiculos("No se ha encontrado el turismo.");
            }
        }
    }

    public void openAlquiler(Alquiler alquiler) {
        for (Alquiler alquilerArray : alquileres) {
            if (alquilerArray == null) {
                alquilerArray = alquiler;
            } else {
                throw new ExcepcionAlquilerVehiculos("No hay espacio disponible.");
            }
        }
    }

}
