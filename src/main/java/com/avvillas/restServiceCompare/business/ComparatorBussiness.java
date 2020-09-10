package com.avvillas.restServiceCompare.business;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Daniel Felipe Melo Melo
 */
@Component
public class ComparatorBussiness {
    
    /**
     * Método que compara 2 strings para comprobar si contienen los mismos caracteres
     * 
     * @param stringParam1 Primer String a comparar
     * @param stringParam2 Segundo String a comparar
     * @return Indica si los 2 Strings contienen los mismos caracteres por su código ASCII
     */
   public boolean compararStrings(String stringParam1, String stringParam2) {
        boolean respuesta = false;
        
        int tamanio1Str = stringParam1.length();
        int tamanio2Str = stringParam2.length();
        int sumStr1 = 0; 
        int sumStr2 = 0;
        
        if ( tamanio1Str == tamanio2Str ) {
            for (int i = 0; i < tamanio1Str; i++){
                sumStr1 += (int) stringParam1.charAt(i);
                sumStr2 += (int) stringParam2.charAt(i);
            }
            
            if(sumStr1 == sumStr2) {
                respuesta = true;
            }    
        }
        
        return respuesta;
    }
    
}
