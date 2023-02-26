/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco_tpfinal;

/**
 *
 * @author dante
 */
public class Administrador {
    
    private int id;
    private String contraseña;

    public Administrador(int id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public Administrador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void hacerMantenimiento(){
        
    }
    
    public void recargarDinero(){
        
    }
    
    public void imprimirInformes(){
        
    }
    
}
