/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lol
 */
public class Alquiler {
    
    private Date fecha;
    private int dias;
    private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private final int MS_DIA = 1000*60*60*24;
    private final double PRECIO_DIA;
    
    public Alquiler (Cliente cliente, Turismo turismo){
        
        fecha = new Date();
        dias = 0;
    }

}
