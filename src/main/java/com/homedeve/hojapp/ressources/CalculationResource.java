package com.homedeve.hojapp.ressources;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.Path;

/**
 *
 * @author Camel
 */
@Path("/calculation")
public class CalculationResource {
  
    public double sommEtProduit() {
        
        ObjectMapper objectMapper = new ObjectMapper();
        return 0;
    }
}
