/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula47;


public class Exercao {
    public static void main(String[] args) {
        int[] vetor = new int[4];
       try{
        System.out.println("Antes da exception");
        vetor[4] = 1;
        vetor[5] = 10;
        System.out.println("Esse texto não será impresso");
       }
       catch (ArrayIndexOutOfBoundsException exception){
           System.out.println("Exeção ao acessar um índice do vetor que não existe");
       }
       
        System.out.println("Esse Texto será impresso após a exception");
    }
    
}
