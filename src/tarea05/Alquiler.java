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
    private final double PRECIO_DIA = 30;
    private Turismo turismo;
    private Cliente cliente;
    
    public Alquiler (Cliente cliente, Turismo turismo){
        this.cliente=cliente;
        this.turismo=turismo;
        fecha = new Date();
        dias = 0;
    }
    
    public Date getDate(){
        return fecha;
    }
    
    public int getDias(){
        return dias;
    }
    
    public double getPrecio(){
        return PRECIO_DIA;
    }
    
    public Turismo getTurismo(){
        return turismo;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void close(Alquiler alquiler){
        dias = difDias(alquiler) + 1;
        
    }
    
    public double getPrecio(Alquiler alquiler){
        return alquiler.getDias() * PRECIO_DIA + alquiler.getTurismo().getCilindrada() / 100;
    }
    
    public int difDias(Alquiler alquiler){
        long tiempoAlquiler = new Date().getTime() - alquiler.getDate().getTime();
        long diasAlquiler = tiempoAlquiler / MS_DIA;            
        return (int)diasAlquiler;
    }
}
