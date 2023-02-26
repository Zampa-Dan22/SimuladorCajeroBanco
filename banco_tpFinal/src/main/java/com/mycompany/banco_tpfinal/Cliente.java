
package com.mycompany.banco_tpfinal;

import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author dante
 */
public class Cliente extends Usuario {
    
    private String Banco = "Santader";
   
    public Cliente() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    

    public String getBanco() {
        return Banco;
    }

   
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }
    
    /**
     * <p>Función que recibe como parametros un Usuario y un contra (Contraseña) para
     * colocarlos como atributos del objeto Cliente.</p>
     * 
     * @param usuario Nombre del usuario
     * @param contra Contraseña del usuario
     */
    @Override
    public void ingresoUsuario(String usuario, String contra) {
        
        this.usuario = usuario;
        this.contra = contra;
        
    }

    /**
     * <p>Método que toma el dato ingresado(monto) y lo suma a la cantidad de dinero que hay en la cuenta.
     * El parametro recibido es un valor positivo de tipo float.</p>
     * @param monto  : es el dinero que se sumará a la cuenta.
     */
    @Override
    public void depositar(float monto) {
        this.cuenta += monto;
    }

    /**
     * <p>Metodo que toma el dato ingresado(monto) y lo usa para disminuir la cantidad de dinero en la cuenta 
     * (dinero en la cuenta - monto).
     * El parametro recibido es un valor positivo de tipo float.</p>
     * 
     * @param monto 
     */
    @Override
    public void retirar(float monto) {
        this.cuenta -= monto;
    }
    
    /**
     * <p> "mostrarDatos()" : Funcion que muestra el dinero total que posee un cliente en su cuenta.</p>
     * @return Descripcion: Retorna un valor String que posee un mensaje con el saldo de la cuenta del usuario. 
     */
    public String mostrarDatos(){
        String fila = "=================================="
                + "\nCAJA DE AHORROS"
                + "\n\nSaldo: AR$ "+this.cuenta;
        
        return fila;
        
    }
    
    /**
     * <p>Método que muestra los movimientos que han ocurrido en la cuenta del usuario
     * tales como:</p>
     * <ul><li> Depósitos. <li>Retiros. </ul>
     * 
     * @return Descripción: Retorna una cadena de caracteres que posee los movimientos de la cuenta.
     */
    public String mostrarMovimientos(){
        String fila = "MOVIMIENTOS  ==============================\n\n";
        Collections.reverse(super.movimientos);   // Invertir lista
        Iterator<String> it = super.movimientos.iterator();
        
        while (it.hasNext()){
            fila += it.next()+"\n\n";
        }
        
        return fila;
    }

    /**
     * <p>Método que ingresa un registro de movimientos a la lista de movimientos del usuario,
     * pueden ser:</p>
     * <ul><li> Depósitos. <li>Retiros. </ul>
     * 
     * @param movimiento 
     */
    @Override
    public void ingresarMovimiento(String movimiento) {
        
        super.movimientos.add(movimiento);
        
    }

    
    
    
}

