/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula54.DiaSemana;


public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();
        
        for(int i = 0; i<dias.length;i++){
            System.out.println(dias[i]);
        }
        System.out.println("--------------------------------");
        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
