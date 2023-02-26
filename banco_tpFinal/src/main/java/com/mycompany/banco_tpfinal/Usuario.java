/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco_tpfinal;

import java.util.ArrayList;

/**
 *
 * @author dante
 */
public abstract class Usuario {
    
    protected String usuario;
    protected String contra;
    protected float cuenta = 10000f;
    protected ArrayList<String> movimientos = new ArrayList<String>();
   
    
    
    public abstract void ingresoUsuario(String usuario, String contra);
    public abstract void depositar(float monto);
    public abstract void retirar(float monto);
    public abstract void ingresarMovimiento(String movimiento);
    
    
}
