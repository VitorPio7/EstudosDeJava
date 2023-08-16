/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula48;


public class MultiplosCatch {
    public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};
        int[]denom = {2,0,4,8,0};
        
        
        for(int i = 0;i<numeros.length;i++){
            try{
            System.out.println(numeros[i]+"/"+denom[i]+"  = " + (numeros[i]/denom[i]));
           }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
            }
            catch(Throwable e2){
                System.out.println("Posição do array inválida");
            }//Erro genérico do java
            
        }
    }
    
}
