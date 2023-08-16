/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio47a52;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;
        opcao = obterOpcaoMenu(sc);
        while (opcao != 3) {
            opcao = obterOpcaoMenu(sc);
            if (opcao == 1) {

            } else if (opcao == 2) {
                adicionarContato(sc, agenda);

            }
        }

    }

    public static void adicionarContato(Scanner sc, Agenda agenda) {
        try {
            System.out.println("Crianto um contato");
            String nome = leInformacaoString(sc, "Entre com o nome do contato");
            String telefone = leInformacaoString(sc, "Entre com o telefone do contato");
            String email = leInformacaoString(sc, "Entre com o email do contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            agenda.adicionarContato(contato);

        } catch (AgendaCheiaExeption ex) {
            System.out.println(ex.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner sc, Agenda agenda) {
        String nomeContato = leInformacaoString(sc, "Entre com o nome do Contato a ser pesquisado");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException ex) {
            System.out.println(ex.geMessage());
        }
    }

    public static String leInformacaoString(Scanner sc, String msg) {
        System.out.println(msg);
        String entrada = sc.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner sc) {

        boolean entradaValida = false;
        int opcao = 3;
        while (!entradaValida) {

            System.out.println("Digite a opção desejava");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");
            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao != 1 || opcao != 2 || opcao != 3) {
                    entradaValida = true;
                } else if (opcao == 1 || opcao == 2 || opcao == 3) {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }
        }

        return opcao;
    }

}
