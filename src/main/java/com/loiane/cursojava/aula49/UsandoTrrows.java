/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula49;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsandoTrrows {
    public static void main(String[] args) {
        System.out.println("Entre com um número decimal");
        try {
            double num = leNumero();
            System.out.println("Voçê digitou"+num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace(); //vai indicar a linha do erro
        }
    }
    public static double leNumero() throws Exception{ // toda vez que for usar o throws quando chamar o método vai ter que usar a excessao
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}
