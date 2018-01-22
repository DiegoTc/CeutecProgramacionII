/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_semana_i;

/**
 *
 * @author diego
 */
public class Lunes {
   
    
    /*
    Tenemos la funcion primerFactorial(int numero)
    Nos devolvera el factorial del numero. Esta funcion solo funcionara con numeros del 1 al 18
    Caso contrario regresa -1 significando error
    */
    public int primerFactorial(int numero){
        return numero;
    }
    
    
    /*
    Tenemos la funcion reversa(String palabra)
    Recibe de parametro un string y regresa el string al revez. 
    El String solo contendra letras y espacios en blanco
    Ejemplo:
    hola    oloh
    hola mundo  oloh odnum
   
    */
    public String reversa(String palabra){
        return palabra;
    }
    
    /*
    Tenemos la funcion palabramasLarga(String palabra)
    Recibe de parametro una string, tiene que devolver la palabra mas larga que se encuentre
    en ese string. Si hay 2 palabras del mismo tamano, se devolvera la primera palabra.
    Ignorar puntuaciones y numeros.
    Documentacion que puede servir: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-
    Ejemplo
    hello world regresa hello
    this is some sort of sentence    regresa sentece
    a confusing /:sentence:/[ this is not!!!!!!!    regresa confusing
    */
    public String palabramasLarga(String palabra){
        return palabra;
    }
    
    
    /*
    La funcion cambiodeLetra(String texto) recibe un String
    Por cada vocal, se remplazara por una letra mayuscula.
    Ejemplo: si se recibe a, pasara a ser A
    
    Por cada consonante, se cambiara por la siguiente letra
    Ejemplo: si se recibe b, pasara a ser c
    
    Ejemplo de un String que se podria pasar
    Hola Mundo regresaria IOmA NUoep
    
    */
    public String cambiodeLetra(String texto){
        return texto;
    }
}
