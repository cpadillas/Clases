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
public class Main {

    public static void main(String[] args) {
        Cuenta c1=new Cuenta();
        Cuenta c2=new Cuenta();
        c1.dueño="Magdalena Sanchez";
        c1.numero=1012;
        c1.clave=1012;
        c1.saldo=0;
        c2.dueño="Joselito Perez";
        c2.numero=1013;
        c2.clave=9876;
        c2.saldo=500000;
        
        c1.consignar(100000);
        c2.cambiar_clave();
        c2.consultar();
    }
    
}
