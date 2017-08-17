/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    Scanner Flujo = new Scanner(System.in);
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
            System.out.println("Saldo insuficiente");
    }
    public void consultar(){
        System.out.println("Sr(a) " +this.dueño +" su saldo es de $"+this.saldo);
    }
    public void cambiar_clave(){
        int valor=0;
        System.out.println("Digite su nueva clave");
        valor = Flujo.nextInt();
        if(valor>0&&valor<10000)
            this.clave=valor;
        else
            System.out.println("Parametro invalido");      
    }
}
