/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula69;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) {
        Theads thread1 = new Theads("Threads #1", 200);
        Theads thread2 = new Theads("Threads #2", 500);
        Theads thread3 = new Theads("Threads #3", 200);
        Theads thread4 = new Theads("Threads #5", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        Thread t4 = new Thread(thread4);

        t1.run();
        t2.run();
        t3.run();
        t4.run();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }

    }

}
