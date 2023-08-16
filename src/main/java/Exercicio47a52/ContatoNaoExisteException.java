/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio47a52;

public class ContatoNaoExisteException extends Exception {
    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    public String geMessage(){
        return "Contato "+nomeContato+" não existe na agenda!";
    }
    
}
