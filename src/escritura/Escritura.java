/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

import Servicios.CadenaServicio;
import entidades.Cadena;

/**
 *
 * @author juans
 */
public class Escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio asd = new CadenaServicio();
        
        Cadena fr1 = asd.crearCadena();
        System.out.println(asd.mostrarVocales(fr1));
        System.out.println("El caracter se repite : " + asd.vecesReptido(fr1));
        
        asd.compararLongitud(fr1);
        System.out.println(asd.unirFrases(fr1));
        System.out.println(asd.reemplazar(fr1));
        asd.contieneFrase(fr1);
        
        
 
    }
    
    
}
