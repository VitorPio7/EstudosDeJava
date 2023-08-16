/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio47a52;

public class Contato {
    
 private static int Contador = 0;   
private String nome;
private String telefone;
private int id;
private String email;


    public Contato() {
        Contador++;
        id =Contador;
    }

    public Contato(String nome, String telefone, int id, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
     
    @Override
    public String toString() {
         String s = "[";
        s+= "Id: "+id;
        s+= "Nome: "+nome;
        s+= "Telefone: "+telefone;
        s+= "Email: "+email;
        s+="]";
         return s;
    }
    

}
