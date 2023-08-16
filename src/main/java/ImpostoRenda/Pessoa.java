/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpostoRenda;

public abstract class Pessoa  {
  private String nome;
  private double valor;
  

    public Pessoa() {
    }

    public Pessoa(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

      
    public String toString() {
        String s = "Nome: "+getNome();
        return s;
    }
    
    public abstract double imposto();

   

  
     
}
