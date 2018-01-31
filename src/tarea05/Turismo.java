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
public class Turismo {
    
    private String matricula, marca, modelo;
    private int cilindrada;
    private static int identificador;
    
    public Turismo(String matricula, String marca, String modelo, int cilindrada){
                
        this.marca=marca;
        this.modelo=modelo;
        if (cilindrada > 0 )
            this.cilindrada=cilindrada;
        else
            throw new ExcepcionAlquilerVehiculos("No se admite esa cilindrada.");
        if(compruebaMatricula(matricula))
            this.matricula=matricula;
        else
            throw new ExcepcionAlquilerVehiculos("Matrícula incorrecta.");
        identificador ++;
        
    }
    
    public Turismo(Turismo turismoCopia){
        
        marca=turismoCopia.getMarca();
        modelo=turismoCopia.getModelo();
        cilindrada=turismoCopia.getCilindrada();
        matricula=turismoCopia.getMatricula();
    }
    
    private boolean compruebaMatricula(String matricula){
        Pattern regex = Pattern.compile("[0-9]{4}[a-z]{3}");
        Matcher matcher = regex.matcher(matricula);
        return matcher.matches();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }
    
    
}
