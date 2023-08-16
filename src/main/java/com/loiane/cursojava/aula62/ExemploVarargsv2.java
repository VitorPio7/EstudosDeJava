package com.loiane.cursojava.aula62;

public class ExemploVarargsv2 {

    public static void main(String[] args) {

        int vetor[] = {1, 2, 6, 45, 5};

        System.out.println(somar(vetor));
        System.out.println(somar(5, 45));
        System.out.println(somar(15,45,45,56));

    }

    static int somar(int vetor[]) {
        int somar = 0;
        for (int i = 0; i < vetor.length; i++) {
            somar += vetor[i];
        }
        return somar;
    }
    
    static int somar(Integer...vetor){
        int somar = 0;
        for(int i=0;i<vetor.length;i++){
            somar+=vetor[i];
        }
        return somar;
    }
    
    static int somar(int a, int b){
        return a+b;
    }
    
}
