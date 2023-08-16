/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula64;

public class Anonima {

    public static void main(String[] args) {
        

    public void imprimeTexto() {
        System.out.println("qualquer texto");
    }

    public static void main(String[] args) {

        Anonima anonima = new Anonima() {
            public void imprimeTexto() {
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        //usando interface
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }
}

}
