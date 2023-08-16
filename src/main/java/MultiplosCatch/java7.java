/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplosCatch;

public class java7 {
     public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};
        int[]denom = {2,0,4,8,0};
        
        
        for(int i = 0;i<numeros.length;i++){
            try{
            System.out.println(numeros[i]+"/"+denom[i]+"  = " + (numeros[i]/denom[i]));
        }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
                System.out.println("Aconteceu um erro");
            }
           
            //Erro genérico do java
            
        }
    }
}
