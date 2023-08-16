/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula64;

public class Externo {

    private String texto = "texto externo";

    public class Interna {
        private String texto = "texto interno";

        public void imprimeTexto() {
            System.out.println(texto);

            System.out.println(Externo.this.texto);
        }
    }
    public static void main(String[] args) {
        
        Externo externa = new Externo();
        Interna interna = externa.new  Interna();
        
        interna.imprimeTexto();
    }
}
