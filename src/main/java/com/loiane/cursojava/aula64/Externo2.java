

package com.loiane.cursojava.aula64;

public class Externo2 {

    public void metodoQualquer() {

        class ClasseLocal {

            private String texto = "texto classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Externo2 externa = new Externo2();

        externa.metodoQualquer();
    }
}
