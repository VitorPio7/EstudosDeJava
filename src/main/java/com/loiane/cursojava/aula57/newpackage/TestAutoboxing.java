/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula57.newpackage;


public class TestAutoboxing {
    public static void main(String[] args) {
        Short num7 =1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 3.5f;
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b = 'b';
        
        //auto un-boxing
        int num13 = num9; //num9.intValue();
        
        //autoboxing em expressões
        num9++;
        
        System.out.println(num9);
        
        //auto unboxing num9 -> autoboxing num13/num9 -> num14
        Integer num14  = num13/num9;
    }
        
}
