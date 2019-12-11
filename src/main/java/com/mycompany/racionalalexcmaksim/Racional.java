/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalexcmaksim;

/**
 *
 * @author alex
 */
public class Racional {

    private int a;
    private int b;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    public Racional(int a, int b) {
        this.a = a;
        if (this.b == 0) {
            this.b = 1;
            System.out.println("Denominador no es valido");
        } else {
            this.b = b;
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        if (this.b == 0) {
            this.b = 1;
            System.out.println("Denominador no es valido");
        } else {
            this.b = b;
        }
    }

    public void imprimirConsola() {
        System.out.println("Numero racional: " + this.getA() + "/" + this.getB());
    }

    @Override
    public String toString() {
        return this.getA() + "/" + this.getB();
    }

    public int sumar(Racional x) {
        int respuesta;
        if (this.b == x.getB()) {
            respuesta = (this.a + x.getA()) / this.b;
        } else {
            respuesta = (this.a * x.getB() + this.b * x.getA()) / (this.b * x.getB());
        }
        return respuesta;
    }
}
