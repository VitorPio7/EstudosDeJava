/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula70;

import com.loiane.cursojava.aula69.Theads;

public class Teste {
    public static void main(String[] args) {
        Theads thread1 = new Theads("#1", 500);
        Theads thread2 = new Theads("#2", 500);
        Theads thread3 = new Theads("#3", 500);
        
        Thread t1 =  new  Thread(thread1);
        Thread t2 =  new  Thread(thread3);
        Thread t3 =  new  Thread(thread3);
        
        
        t1.setPriority(5); //defini o nível de prioridade da tread, quanto maior, maior é a prioridade;
        t2.setPriority(3);
        t3.setPriority(1);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        
        
        
   }
    
}
