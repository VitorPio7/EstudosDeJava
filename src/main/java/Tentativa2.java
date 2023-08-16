
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tentativa2 {
    public static void main(String[] args) {
        try {
            fazerPergunta();
        } catch (Exception ex) {
            System.out.println("Não reconhecido");
            System.out.println( ex.getMessage()); 
            ex.printStackTrace();
            
        }
        finally{
            System.out.println("Programa executado corretamente");
        }
    }
    
    public static void fazerPergunta() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();
    }
    
}
