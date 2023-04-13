/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class CadenaServicio {
 Scanner sc = new Scanner(System.in);
    public CadenaServicio() {
    }
    
     public Cadena crearCadena(){
        System.out.println("Ingrese la Frase que desea: ");
        String frase = sc.next();
        int longitud;
        
        return new Cadena (frase);
        
         
    }
     public int mostrarVocales(Cadena fr){
         String digit;
         int contador = 0;
         for (int i = 0; i < fr.getLongitud()-1; i++){
           digit =  fr.getFrase().substring(i, i+1);
           if (digit.equalsIgnoreCase("a") || digit.equalsIgnoreCase("e") || digit.equalsIgnoreCase("i") || digit.equalsIgnoreCase("o") 
                   || digit.equalsIgnoreCase("u")){
               contador++;
           }
           
         }
         return contador;
     }
     //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
     //y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:

     public String invertirFrase(Cadena fr){
         String digit;
         String invertido = "";
         for (int i = fr.getLongitud()-1; i > 0; i--){
             digit =  fr.getFrase().substring(i, i+1);
             invertido = invertido.concat(digit);
         }
         return invertido;
     }
     public int vecesReptido (Cadena fr){
         System.out.println("Establezca un caracter");
         String caracter = sc.next();
         String digit;
         int contador = 0;
         for(int i = 0; i < fr.getLongitud(); i++){
             digit =  fr.getFrase().substring(i, i+1);
             if (digit.equalsIgnoreCase(caracter)){
                 contador++;
             }
         
     }
         return contador;
     }
 //Método compararLongitud(String frase), deberá comparar la longitud de la 
 //frase que compone la clase con otra nueva frase ingresada por el usuario.
   
}
