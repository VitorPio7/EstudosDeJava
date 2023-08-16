/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package com.loiane.cursojava.aula65;

/**
 *
 * @author vitor
 */
public @interface InformacaoAula {
      String autor();
      int aulaNumero();
      String blog() default "http://loiane.com";
      String site() default "http://loiane.training";
     
      
}
