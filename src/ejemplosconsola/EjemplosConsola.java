/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author gonza
 */
public class EjemplosConsola {
    
    //declaro un array de ints de instancia
    int[] listaNumeros = {20, 31, 27, 2, 5, 99};
    
    /* 
    el metodo maximos va a calcular el maximo y el segundo maximo de una 
    lista de numeros
    */
    private int[] maximos (int[] lista){
        
        //Declaramos un array de dos elementos para guardar e maximo y 
        //el segundo maximo
        int [] listaMaximos = {lista[0], lista[0]};
        for(int i=0; i < lista.length; i++){
            if(listaMaximos[0] <= lista [i]){
                listaMaximos[0] = lista[i];
                }else{
                if(listaMaximos[1]<lista[i]){
                    listaMaximos[1] = lista[i];
                }
            }

        }
        
        return listaMaximos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
       
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        
        
        
    }
    
}
