package com.avvillas.restServiceCompare.controller;

import com.avvillas.restServiceCompare.business.ComparatorBussiness;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Daniel Felipe Melo Melo
 */
@RequestMapping("/api")
@RestController
public class CompareController {
    
    @Autowired
    ComparatorBussiness comparatorBussiness;
    
    /**
     * Servicio REST que recibe 2 strings y indica si son iguales independientemente su orden
     * @param stringParam1
     * @param stringParam2
     * @return Json indicando si son iguales los strings
     */
    @GetMapping(value="/compare", produces = MediaType.APPLICATION_JSON_VALUE)
    public JSONObject comparacionStrings(@RequestParam("strParam1") String stringParam1,
                                         @RequestParam("strParam2") String stringParam2) {
        
        JSONObject respuestaJSON = new JSONObject();
        
        boolean respuesta = comparatorBussiness.compararStrings(stringParam1, stringParam2);
        
        respuestaJSON.put("esIgual", respuesta);
        
        return respuestaJSON; 
    }
    
}
