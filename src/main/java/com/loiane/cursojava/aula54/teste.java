/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula54;


public class teste {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        
        System.out.println(dia.toString()+" - "+dia.getValor());
        
        Data data = new Data(1, 4,2023 , DiaSemana.SEXTA);
    }
    
}
