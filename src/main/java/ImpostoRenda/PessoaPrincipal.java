/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpostoRenda;

import java.util.Scanner;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        System.out.print("Digite seu nome: ");
        pessoaFisica.setNome(sc.next());
        System.out.print("\nDigite seu cpf: ");
        pessoaFisica.setCPF(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaFisica.setValor(sc.nextDouble());
        
        PessoaFisica pessoaFisica2 = new PessoaFisica();
        System.out.print("\nDigite seu nome: ");
        pessoaFisica2.setNome(sc.next());
        System.out.print("\nDigite seu CPF: ");
        pessoaFisica2.setCPF(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaFisica2.setValor(sc.nextDouble());
       
        PessoaFisica pessoaFisica3 = new PessoaFisica();
        System.out.print("\nDigite seu nome: ");
        pessoaFisica3.setNome(sc.next());
        System.out.print("\nDigite seu cpf: ");
        pessoaFisica3.setCPF(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaFisica3.setValor(sc.nextDouble());
       
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        System.out.print("\nDigite seu nome: ");
        pessoaJuridica.setNome(sc.next());
        System.out.print("\nDigite o cnpj: ");
        pessoaJuridica.setCNPJ(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaJuridica.setValor(sc.nextDouble());
        
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
        System.out.print("\nDigite seu nome: ");
        pessoaJuridica2.setNome(sc.next());
        System.out.print("\nDigite seu CNPJ: ");
        pessoaJuridica2.setCNPJ(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaJuridica2.setValor(sc.nextDouble());
        
        PessoaJuridica pessoaJuridica3 = new PessoaJuridica();
        System.out.print("\nDigite seu nome: ");
        pessoaJuridica3.setNome(sc.next());
        System.out.print("\nDigite CNPJ: ");
        pessoaJuridica3.setCNPJ(sc.next());
        System.out.print("\nDigite o valor: ");
        pessoaJuridica3.setValor(sc.nextDouble());
        
        Pessoa[] pessoa = new Pessoa[6];
        pessoa[0] = pessoaFisica;
        pessoa[1] = pessoaFisica2;
        pessoa[2] = pessoaFisica3;
        pessoa[3] = pessoaJuridica;
        pessoa[4] = pessoaJuridica2;
        pessoa[5] = pessoaJuridica3;
        
        for(Pessoa p : pessoa){
            System.out.println(p.toString());
        }
        
     }
    }
    

