/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula63;


public class ExemploPrintf {
    public static void main(String[] args) {
        System.out.printf("Hello %s", "Olá, Mundo");  //O "%s" indica que é uma string
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!");    //PASSA PRA CAIXA ALTA
        System.out.println();
        
        System.out.printf("%c",'c');  //O "%c" indica char
        System.out.println();
        System.out.printf("%C", 'c'); //PASSA PARA CAIXA ALTA    
        System.out.printf("%n"); //PULA LINHA DE FORMA ELEGANTE
        
        
        int valor = 123456789;
        System.out.printf("%d",valor); //saida de um número inteiro
        System.out.printf("%n");
        double pontoFlutuante = 3.1456789;
        System.out.printf("%f",pontoFlutuante); //O "%f" indica ponto flutuante
        System.out.printf("%n");
        
        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s",olaMundo); //O "%20s" significa que possui 20 carac. na direita;
        System.out.printf("%n");
        System.out.printf("%-20s",olaMundo); //O "%-20s" significa que possui 20 carac. na esquerda;
        System.out.printf("%n");
        System.out.printf("%+d",valor);
        System.out.printf("%n");
        System.out.printf("%015d", valor); //15 digitos a direita
        System.out.printf("%n");
        System.out.printf("%,d",valor); //separar por virgulas
        int valor2 = -123456789;
         System.out.printf("%n");
        System.out.printf("% d",valor); //um espacao do sinal positivo
         System.out.printf("%n");
        System.out.printf("%.2f",pontoFlutuante);//Arredonda para ponte flutuante de 2 digitos
         System.out.printf("%n");
        System.out.printf("R$%10.2f",pontoFlutuante); //ponto flutuante com dois digitos e com preco
         System.out.printf("%n");
        testeMaisCompleto();
    }
    private static void testeMaisCompleto(){
        double[] precos = {10000, 123.54,7843.567,1,4.56789};
        
        
        for(int i=0;i <precos.length;i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1,precos[i]);
        }
    }
    
}
