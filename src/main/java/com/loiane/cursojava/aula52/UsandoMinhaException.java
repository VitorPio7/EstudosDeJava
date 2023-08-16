/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula52;


public class UsandoMinhaException {
    public static void main(String[] args)  {
        int[] numeros = {4,8, 5,21,16,32,64,128};
        int[]denom = {2,0,4,8,0,2,3};
        
        
        for(int i = 0;i<numeros.length;i++){
            try{
                if(numeros[i]%2!=0){
                    throw new DivisaoNaoExata(numeros[i],denom[i]);
                }
            System.out.println(numeros[i]+"/"+denom[i]+"  = " + (numeros[i]/denom[i]));
        }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e1){
                System.out.println("Aconteceu um erro");
                e1.printStackTrace();
                System.out.println(e1.getMessage());
            }
           
            //Erro genérico do java
            
        }
    }
}
