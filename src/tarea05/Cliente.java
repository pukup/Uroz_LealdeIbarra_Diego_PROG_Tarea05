/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lol
 */
public class Cliente {
    
    private String nombre, direccion, localidad, codigoPostal;
    private int identificador;
    private static int numClientes;
      
    public Cliente(String nombre, String direccion, String localidad, String codigoPostal){
        
        this.nombre=nombre;
        this.direccion=direccion;
        this.localidad=localidad;
        if (compruebaCodigoPostal(codigoPostal))
            this.codigoPostal=codigoPostal;
        else
            throw new ExcepcionAlquilerVehiculos("Código postal incorrecto.");
        
    }
    
    public Cliente(Cliente clienteCopia){
        nombre=clienteCopia.getNombre();
        direccion=clienteCopia.getDireccion();
        localidad=clienteCopia.getLocalidad();
        codigoPostal=clienteCopia.getCodigoPostal();
    }

    private boolean compruebaCodigoPostal(String codigoPostal){

        Pattern regex = Pattern.compile("[0-9]{5}");
        Matcher matcher = regex.matcher(codigoPostal);
        return matcher.matches();
    }
    
}
