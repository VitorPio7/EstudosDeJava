
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Tentativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        }
        catch(InputMismatchException e1){
            System.out.println("Não reconhecido");
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }
        
        
    }
}
