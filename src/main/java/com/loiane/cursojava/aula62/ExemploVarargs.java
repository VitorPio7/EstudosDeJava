/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula62;

public class ExemploVarargs {
    public static void main(String[] args) {
        
        System.out.println(soma(1,2));
        
        int[] vetor = {1,12,5,6,4};
        System.out.println(soma(vetor));
        
        System.out.println(soma(1,2));
    }
    
    
    
    static int soma(int a, int b){
        return a + b;
    }
      static int soma(int a, int b, int c){
        return a + b + c;
    }  
      
      static int soma(int [] vetor){
       int total = 0;
       for(int i = 0; i<vetor.length;i++){
           total+=vetor[i];
       }
       return total;
    }
      
      static int soma(Integer... vetor){
          int total = 0;
          for(int i=0;i<vetor.length;i++){
              total+=vetor[i];
          }
          return total;
      }
      
      
      
      
      
}

