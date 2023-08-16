/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio47a52;

public class Agenda {
    private Contato[] contatos;
    
    public Agenda(){
        contatos = new Contato[5];
    }
 public void adicionarContato(Contato c) throws AgendaCheiaExeption{
      boolean cheia = true;
      for(int i = 0;i<contatos.length;i++){
          if(contatos[i]==null){
              contatos[i] = c;
              cheia = false;
              break;
          }
      }
      if(cheia){
        throw new AgendaCheiaExeption();
      }
   }
 
 public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException{
     for(int i = 0; i<contatos.length;i++){
         if(contatos[i]!=null){
             if(contatos[i].getNome().equalsIgnoreCase(nome)){
               return i;  
             }
         }
     }
     throw new ContatoNaoExisteException(nome);
 }
    
    public String toString() {
        String s ="";
        for(Contato c : contatos){
            s += c.toString() +"\n";
        }
        return s;
    }
    
}
