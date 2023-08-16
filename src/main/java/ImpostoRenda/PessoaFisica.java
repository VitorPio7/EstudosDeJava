/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpostoRenda;

public class PessoaFisica extends Pessoa{
 
    private String CPF;

    public PessoaFisica() {
    }

    public PessoaFisica(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public double imposto() {
      double dinheiro = getValor();
      if(dinheiro == 0 && dinheiro <=1400){
          
          return dinheiro*0;
      }
      if(dinheiro>=1400.01 && dinheiro<=2100){
          
          return dinheiro*0.10;
      }
      if(dinheiro>=2100.01 && dinheiro<=2800){
          
          return dinheiro*0.15;
      }
      if(dinheiro>=2800.01 && dinheiro<=3600){
          
          return dinheiro*0.25;  
      }
      if(dinheiro>=3600.01){
          return dinheiro*0.30;
      }
      return dinheiro;
    }

    public String toString() {
      String s = "Pessoa Física";
      s+="\n"+super.toString();
      s+="\nCPF: "+getCPF();
      s+="\nImposto: "+imposto();
      return s;
    }
  
     
}
