/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalexcmaksim;

/**
 *
 * @author maksim
 */
public class AppRacional {
    public static void main(String[] args) {
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);
        
        Racional a = Racional.aleatorio();

        z.imprimirConsola();
        k.imprimirConsola();
        a.imprimirConsola();
        
        System.out.println(Racional.igualdad(z, k));
        
        z.sumar(k);
        System.out.println(z);
        
        System.out.println(Racional.division(z, k));
        
        z.producto(k);
        System.out.println(z);
    }
}
