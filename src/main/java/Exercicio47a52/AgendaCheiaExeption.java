/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio47a52;


public class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já esta cheia";
    }
    
    
}
