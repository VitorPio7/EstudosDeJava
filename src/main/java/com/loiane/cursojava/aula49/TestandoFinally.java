/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula49;


public class TestandoFinally {
    public static void main(String[] args) {
     
        int[] numeros = {4,8,16,32,64,128};
        int[]denom = {2,0,4,8,0};
        
        
        for(int i = 0;i<numeros.length;i++){
            try{
            System.out.println(numeros[i]+"/"+denom[i]+"  = " + (numeros[i]/denom[i]));
        }
            catch(ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
                System.exit(0);//vai encerrar o programa
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválida");
            }//Erro genérico do java
            finally{
                System.out.println("Essa linha é sempre impressa sempre após o try ou catch");
            }//O finaly sempre será executado
            
        }
    }
    }

