/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String dueño;
    public int saldo;
    
    public void consignar(int valor){
        this.saldo=this.saldo+valor;
    }
    public void retirar(int valor){
        if(valor<this.saldo)
            this.saldo=this.saldo-valor;
        else
            System.out.println("Saldo insufciente");
    }
    public void consultar(){
        System.out.println("Su saldo es "+this.saldo);
    }
    public void cambiar_clave(int valor){
        this.clave=valor;
    }
}
