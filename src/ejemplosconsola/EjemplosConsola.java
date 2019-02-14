/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author gonza
 */
public class EjemplosConsola {
    
    //declaro un array de ints de instancia
    int[] listaNumeros = {200, 31, 27, 2, 5, 99};
    int[] listaNumeros2 = {-11, -5, -34, -7, -209, -33, -77, -7};
    int[] listaNumeros3 = {999, 200, -4, 158, 5, 999, 777, 9};
    /* 
    el metodo maximos va a calcular el maximo y el segundo maximo de una 
    lista de numeros
    */
   private int[] maximos (int[] lista){
        
        //Declaramos un array de dos elementos para guardar e maximo y 
        //el segundo maximo
        int [] listaMaximos = {lista[0],lista[1]};
        for(int i=1; i < lista.length; i++){
            
            if(listaMaximos[0] <= lista [i]){
                
                
                  listaMaximos[1]=listaMaximos[0];  
                
                 
                 listaMaximos[0] = lista[i]; 
                 
            }else{
                if(lista[i]>=listaMaximos[1]){
                    listaMaximos[1]=lista[i];
                    
                }
            }
            
            
        }
        
        return listaMaximos;
    }
    
   private boolean palindromo(String cadena){
        
        //Primer fase, creo un nuevo string que sea una copia del anterior
        // que me pasan pero quitando los espacios en blanco.
        String auxiliar = "";
        for(int i =0; i< cadena.length();i++){
            if(cadena.charAt(i) != ' '){
            auxiliar = auxiliar + cadena.charAt(i);
        }
        }
        //ahora en auxiliar tenemos el string pero sin espacios en blanco
        // declaro dos indices para que digan que posicion están 
        int indiceIzq = 0;
        int indiceDer = auxiliar.length()-1;
        
        
        // mientras que sean iguales los caracteres en esas posiciones la palabra sera un palindromo
        //y en el momento en que na comparacion falle es que no es un palindromo
        
        // ademas si el inice izquierdo es mayor que el derecho, ya ha chequedo toda la frase
        while(auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            
            indiceIzq++;
            indiceDer--;
            
        }
        boolean resultado = true;
        if(indiceIzq < indiceDer){ // si esto se cumple no es un palindromo
            resultado = false;
            System.out.print("NO ES UN PALINDROMO  ");
        }else{
            System.out.print("SI ES UN PALINDROMO  ");
        }
        
        return resultado; //TODO; hay que cambiar esto luego para que funione bien.
    }

   private boolean isograma (String palabra){
        
        for(int j=0;j<palabra.length()-1;j++){ // Este bucle nos da la posicion de la etra que comparamos
            
          for(int i=j+1;i<palabra.length();i++){//esta nos dara la letra con la que comparamos nuestra letra elegida,  
                                                // y lo hara con todas las restantes de la palabra.
            
            if(palabra.charAt(j) == palabra.charAt(i)){  // si en algun momento coincide el programa se acaba y retorna falso
                System.out.print("NO ES UN ISOGRAMA  ");
                return false;
              }
          }
        }
        
        System.out.print("ES UN ISOGRAMA  ");
        return true;
    }
        
   private void imprimeMes (int numX, int diasMes){
        
        int contador = 1; //contador para saber la posicion en la semana
        int diasSemana=1; //contador para saber el numero de día de mes
        
        
        //recibimos cuantas XX tenemos que poner al principio del mes y lo introducimos en un for
        while(numX>=7){
            numX = numX -7;
        }
        
        for (int i = 0; i < numX; i++) {
            System.out.print("XX  ");
            contador = contador + 1;
        }

        
        // Una vez hemos impreso las XX contamos los dias del mes y los imprimimos, 
        //dependiendo si es menor de 9 pondremos un cero delante y si el resto de la division del 
        //contador entre 7 es igual  a cero, realizaremos un salto de linea
        for (int j = 1; j <= diasMes; j++) {
            
            //si los dias de la semana son superior a 30 reiniciará el contador para empezar el mes de nuevo
            if(diasSemana>30){
                diasSemana = 1;
               
             }

            if (contador% 7 == 0 ) {

                contador = 0;
                
                if (diasSemana < 10) {
                    System.out.println("0" + diasSemana + "  ");

                } else {
                    System.out.println(diasSemana + "  ");

                }
            }else{

            if (diasSemana < 10) {
                System.out.print("0" + diasSemana + "  ");

            }else{
                System.out.print(diasSemana + "  ");
                
            }
            }
            contador = contador + 1;
            diasSemana = diasSemana + 1;

        }
        //si el contador es distinto de 1 (primera posicion donde no queremos poner XX
        //si se cumple pondremos XX hasta llegar a laposicion 7 del contador.
        if(contador !=1){
             for (int i = contador; i <= 7; i++) {
                 if(contador == 7){
                     System.out.println("XX  ");
                 }else{
                      System.out.print("XX  ");
                 }
                 contador = contador + 1;
             }
        }
        System.out.println(" ");

       
        
    }
    
   private boolean anagrama (String palabraA, String palabraB){
        
        palabraA = palabraA.toUpperCase();
        palabraB = palabraB.toUpperCase();
        
        boolean anagrama = false; // indica si las palabras son anagramas o no.
        
        
            if(palabraA.length() == palabraB.length()){ //Solo empiezo a chequear si las dos palabras 
//                                                     //tienen la misma longitud.
//            
//                                                     
//           char[] ordenada1 = palabraA.toCharArray(); 
//           //convierto por caracteres la palabraA en un Array
//           Arrays.sort(ordenada1);
//           // uso una funcion de java para ordenar alfabeticamente
//           String cadena1 = new String(ordenada1);
//           // y lo vuelvo a convertir en un String
//           
//           char[] ordenada2 = palabraB.toCharArray();
//           Arrays.sort(ordenada2);
//           String cadena2 = new String(ordenada2);
//           
//           
//           //Aqui debemos eliminar los espacios para que no de el error
//
//           if(cadena1.equals(cadena2)){
//              // Si son iguales la variable booleana se covierte en verdadera 
//               anagrama = true;           
//           }
//        }
//        System.out.println("¿" + palabraA + " y " + palabraB + " son anagramas?");
//        return anagrama;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                for(int i=0; i<palabraA.length() ; i++){
                    
                    int posicion = 0;
                    
                    while(posicion < palabraB.length() && palabraA.charAt(i) != palabraB.charAt(posicion)){
                        
                        posicion ++;
                                              
                        }
                    if(posicion == palabraB.length()){
                        return false;
                    }else{
                    
                            palabraB = palabraB.substring(0, posicion) +  palabraB.substring(posicion+1);  
                    }
                }  
                if(palabraB.length() == 0){
                    anagrama = true;
                }
            }
                return anagrama;
    }
    
   private void acronimo (String str){
        
        str = str.toUpperCase();
        
        String[] arrayPalabras = str.split(" ");
        // separa por palabras, en este caso lo que este separado por un espacio, y las convierte en un array
        
        for(int i=0; i < arrayPalabras.length; i++){
           
            // eliminamos las palabras que queremos ignorar del array.
            if(arrayPalabras[i].equals("Y") || arrayPalabras[i].equals("E") 
                    || arrayPalabras[i].equals("DE") || arrayPalabras[i].equals("LA") 
                    || arrayPalabras[i].equals("LAS") || arrayPalabras[i].equals("DEL")){
                
                arrayPalabras[i] = "";   
            }else{ 
                
                // Si no la elimina imprimira la primera letra de la palabra
                System.out.print(arrayPalabras[i].substring(0, 1));
            }
        }
        System.out.println();
     
        
    }
    
   private boolean escaleraDePalabras(char[][] matriz){
       
       int errores = 0;
       System.out.println();
       
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               System.out.print(matriz[i][j]);
               if(i<matriz.length-1){
                   
                  if(matriz[i][j] != matriz[i+1][j]){
                      errores = errores + 1;
                    }
               }  
           }
           System.out.println();
           if(errores>1){
               
               return false;
               
           }else{
               errores = 0;
           }
       } 
        
        return true;     
   
   }
   
   private int costeErroresADN (String uno, String dos){
       
  
       
       int error = 0;
       //a-t     c-g  != 1              -  coste 2
       for(int i = 0; i < uno.length();i++){

            if(uno.charAt(i) == 'A'){
                if(dos.charAt(i) == '-'){
                    error = error + 2;
                }else{
                if(dos.charAt(i) != 'T'){
                    error = error + 1;
                }
                }
            }
            if(uno.charAt(i) == 'T'){
                if(dos.charAt(i) == '-'){
                    error = error + 2;
                }else{
                if(dos.charAt(i) != 'A'){
                    error = error + 1;
                }
                }
            }
            if(uno.charAt(i) == 'C'){
                if(dos.charAt(i) == '-'){
                    error = error + 2;
                }else{
                if(dos.charAt(i) != 'G'){
                    error = error + 1;
                }
                }
            }
            if(uno.charAt(i) == 'G'){
                if(dos.charAt(i) == '-'){
                    error = error + 2;
                }else{
                if(dos.charAt(i) != 'C'){
                    error = error + 1;
                }
                }
            }
            if(uno.charAt(i) == '-'){
                error = error + 2;
            }

       }
       
       return error;
   }
   
   private boolean cabeUnaCaja (boolean [][] camion, int ancho, int alto){
       
       int k;
       int m;
       
       for(int t=0;t<2;t++){
       
       for(int i = 0; i<camion.length;i++){
           for(int j = 0; j<camion[0].length;j++){
               
               k=0;
               while((i+k)<camion.length && !camion[i+k][j] && k < alto){
                   
                   m=0;
                   while((j+m)<camion[0].length && !camion[i+k][j+m] && m< ancho){
                       m++;
                   }
                   if(m!=ancho){ // significa que no hay hueco del ancho pedido
                       k = alto;
                   }
                   k++;
               }
               if(k == alto){//significa que ha encontrado el hueco correcto
                   if(t==1){
                       System.out.print("Girada, ");
                   }
                System.out.println("la caja cab en: " + i + " " + j);
                return true;
           }
       }
       }
       int x = ancho;
       
       ancho = alto;
       alto = x;
       
   }
       System.out.println("La caja no cabe");
       return false;
       
   }
   
   private int strStr (String str1, String str2){
       int n= 0;
       int j= 0;
       int m = 0;

       for(int i = 0; i<str1.length();i++){

           if(str1.charAt(i) == str2.charAt(0)){
               n=i;
               j=i;
           
           
       
                for(int x = 0; x<str2.length();x++){
           
                    if( str1.charAt(n) != str2.charAt(x)){
                        break;
                       }
                      
                    n++;
                    m+=1;
           
                }
                if(m == str2.length()){
                    return j;
                }else{
                    m=0;
                }
            }
       }
           
      return -1; 
   }
   
   private int rpn (String[] calculadora){
       
       int x = 0;
       int y = 0;
       int resultado = 0;
       
       int[] pila = new int[10];

       for(int i = 0; i<calculadora.length;i++){
           
           
          if(calculadora[i] == "+"){
              
              pila[y-2] = pila[y-1] + pila[y-2];
              y=y-1;
              pila[y]=0;
              continue;
          }
          if(calculadora[i] == "-"){
              
              pila[y-2] = pila[y-1] - pila[y-2];
              y=y-1;
              pila[y]=0;
              continue;
          }
          if(calculadora[i] == "*"){
              
             pila[y-2] = pila[y-1] * pila[y-2];
             y=y-1;
             pila[y]=0;
             continue;
          }
          if(calculadora[i] == "/"){
              
             pila[y-2] = pila[y-1] / pila[y-2];
             y=y-1;
             pila[y]=0;
             continue;
          }

           x = Integer.parseInt(calculadora[i]);
           pila[y]=x;
           y++;       
       }
       for(int j=0;j<pila.length;j++){
           System.out.print(pila[j]+ ", ");
       }

       return pila[y-1];
   
           
       
   }
    
            
    public static void main(String[] args) {
        
        EjemplosConsola ejercicios = new EjemplosConsola();
       
        
        // EJERCICIOS MAXIMO Y SEGUNDO MAXIMO
        
//        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
//        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
//        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
        
       
        // EJERCICIO PALINDROMO
        
//        System.out.println(ejercicios.palindromo("ACASO HUBO BUHOS ACA"));
//        System.out.println(ejercicios.palindromo("ESTO NO PUEDE SER UN PALINDROMO"));
//        System.out.println(ejercicios.palindromo("TACOCAT"));
//        System.out.println(ejercicios.palindromo("LIGAR ES SER AGIL"));
//        System.out.println(ejercicios.palindromo("DABALE ARROZ A LA ZORRA EL ABAD"));
//        System.out.println(ejercicios.palindromo("HABIA UNA VEZ"));
        
        
        //EJERCICIO ISOGRAMA
        
//       System.out.println(ejercicios.isograma("murcielago"));
//        System.out.println(ejercicios.isograma("ana"));
//        System.out.println(ejercicios.isograma("locura"));
//        System.out.println(ejercicios.isograma("murcielagoo"));
//        System.out.println(ejercicios.isograma("mmurcielago"));
//        System.out.println(ejercicios.isograma("omurcielago"));
        
       
          //EJERCICIO IMPRIMEMES
          
//        ejercicios.imprimeMes(5,28);
//        ejercicios.imprimeMes(9,30);
//        ejercicios.imprimeMes(1,31);
        

          //EJERCICIO ANAGRAMA
          
//        System.out.println("Amor Roma " + ejercicios.anagrama("amor", "roma"));
//        System.out.println("riesgo sergio " + ejercicios.anagrama("riesgo", "sergio"));
//        System.out.println("amorr rroma " + ejercicios.anagrama("amorr", "rroma"));
//        System.out.println("renacimiento comportamiento " + ejercicios.anagrama("renacimiento", "comportamiento"));
//        System.out.println("frase fresa " + ejercicios.anagrama("frase", "fresa"));
//        System.out.println("jamon pepee " + ejercicios.anagrama("jamon", "pepee"));
//        

            //EJERCICIO ACRONIMO
            
//         ejercicios.acronimo("Alta Velocidad Española");
//         ejercicios.acronimo("Objeto Volador No Identificado");
//         ejercicios.acronimo("Tecnología de la Información y de las Comunicaciones");
//         ejercicios.acronimo("Asociación de Futbolistas Españoles");
//         ejercicios.acronimo("Atencion, Interes, Deseo y Acción");
//         ejercicios.acronimo("Departamento Administrativo del Medio Ambiente");
//         ejercicios.acronimo("Departamento de r 2");

            //EJERCICIO ESCALERA DE PALABRAS
            
                // Para crear este array podemos introducirlo como una lista de palabras 
                // escrita y luego dividirlo en char ??
//           	char	[][]	listaPalabras	=	{
//                    {'P','A','T','A'},
//                    {'P','A','T','O'},
//                    {'R','A','T','O'},
//                    {'R','A','M','O'},
//                    {'G','A','M','O'},
//                    {'G','A','T','O'},
//                    {'M','A','T','O'},
//                };
//            
//            System.out.println(ejercicios.escaleraDePalabras(listaPalabras));
//            
//            char	[][]	listaPalabras2	=	{
//                    {'P','A','T','A'},
//                    {'R','A','T','A'},
//                    {'R','A','M','A'},
//                    {'C','A','M','A'},
//                    {'C','A','L','A'},
//                    {'C','O','L','O'},
//                };
//            
//            System.out.println(ejercicios.escaleraDePalabras(listaPalabras2));
            
            
            
            //EJERCICIO ADN
            
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("ACGT", "TGCA"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("AAAAAAAA", "TTTATTTT"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("GATTACA", "CTATT-T"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("CAT-TAG-ACT", "GTATATCCAAA"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("--------", "ACGTACGT"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("TAATAA", "ATTATT"));
//            System.out.println("Resultado: errores = " + ejercicios.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
            


            //EJERCICIO MUDANZA
            
//                boolean[][]	camion	=	{
//                    {true, true, true, false, false, true, true,  true},
//                    {true, true, true, false, false, true, true,  true},
//                    {true, true, true, false, false, true, true,  true},
//                    {true, true, true, true,  true,  true, false, false},
//                    {true, true, true, true,  true,  true, false, false}
//                    };
//
//              ejercicios.cabeUnaCaja(camion, 2, 3);
//              ejercicios.cabeUnaCaja(camion, 2, 4);
//              ejercicios.cabeUnaCaja(camion, 3, 2);
//              ejercicios.cabeUnaCaja(camion, 2, 2);
//              
//              boolean[][]	camion2	=	{
//                    {true,  true,  true,  false, false, true, true,  true},
//                    {true,  true,  true,  false, false, true, false, false},
//                    {true,  true,  true,  true,  true,  true, false, false},
//                    {false, false, false, true,  true,  true, false, false},
//                    {false, false, false, true,  true,  true, false, false}
//                    };
//              
//              ejercicios.cabeUnaCaja(camion2, 2, 3);
//              ejercicios.cabeUnaCaja(camion2, 4, 2);
//              ejercicios.cabeUnaCaja(camion2, 3, 2);
//              ejercicios.cabeUnaCaja(camion2, 4, 4);
              
              
              
              //StrStr
//              System.out.println(ejercicios.strStr("xxbadxx", "bad"));
//              System.out.println(ejercicios.strStr("Los Simpson", "Simpson"));
//              System.out.println(ejercicios.strStr("catDecathlon", "cat"));
//              System.out.println(ejercicios.strStr("Verano", "radar"));
//              System.out.println(ejercicios.strStr("Programacion", "maci"));
//              System.out.println(ejercicios.strStr("colorido", "color"));
//              System.out.println(ejercicios.strStr("Gatos", "tor"));
//              System.out.println(ejercicios.strStr("pitufo", "tufo"));


                    //RPN
                
                String[] lista1 = {"1","2","+","3","*","8","*"};    
                System.out.println(ejercicios.rpn(lista1));
                
                String[] lista2 = {"6","2","+","2","/","1","+","8"};   
                System.out.println(ejercicios.rpn(lista2));
                
                String[] lista3 = {"3","2","+","7","*","15","21","+","-"};    
                System.out.println(ejercicios.rpn(lista3));
                
                String[] lista4 = {"18","2","+","3","*","600","/","45"};     
                System.out.println(ejercicios.rpn(lista4));
                
                String[] lista5 = {"1","2","+","3","*","20","+"};     
                System.out.println(ejercicios.rpn(lista5));
                
                String[] lista6 = {"5","8","-","1","-"};     
                System.out.println(ejercicios.rpn(lista6));
                
                String[] lista7 = {"10","15","17","+","45"};      
                System.out.println(ejercicios.rpn(lista7));
                
                String[] lista8 = {"10","50","32","14","78","12","+","*","/","-"};      
                System.out.println(ejercicios.rpn(lista8));

    }
    
}
