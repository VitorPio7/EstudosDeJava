/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImpostoRenda;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public PessoaJuridica(String CNPJ, String nome, double valor) {
        super(nome, valor);
        this.CNPJ = CNPJ;
    }

     
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
  
    public String toString() {
      String s = "Pessoa Física";
      s+="\n"+super.toString();
      s+="\nCNPJ: "+getCNPJ();
      s+="\nImposto:"+imposto();
      
      return s;
    }

    
    public double imposto() {
     return getValor() * 0.10;
    }
  
    
}
