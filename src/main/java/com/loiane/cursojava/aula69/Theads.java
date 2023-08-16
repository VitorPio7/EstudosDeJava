/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula69;

public class Theads implements Runnable {
     private String nome;
     private int time;
   
     public Theads(String nome ,int time){
         this.nome = nome;
         this.time = time;
         
    Thread t = new Thread(this);
    t.start();
     }
   
    public void run() {
        for(int i = 0;i<=6;i++){
            System.out.println(nome+ " contador "+i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
              ex.printStackTrace();
            }
        }
        System.out.println("Programa finalizado");
    
    }
    
}
