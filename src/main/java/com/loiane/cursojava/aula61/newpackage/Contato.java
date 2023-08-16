/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula61.newpackage;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", email="
                + email + "]";
    }
}
