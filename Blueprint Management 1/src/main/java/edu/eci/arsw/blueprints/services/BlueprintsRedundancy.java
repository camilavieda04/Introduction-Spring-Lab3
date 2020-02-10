/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.services;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintsFilter;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author jimmy.chirivi
 */
@Service
public class BlueprintsRedundancy implements BlueprintsFilter {

    @Override
    public void filtering(Set<Blueprint> blueprints) {
        for(Blueprint bp:blueprints){
            Blueprint temp  = bp;
            int del =0;
            for(int i=0; i<temp.getPoints().size();i++){
                if(i+1<temp.getPoints().size()){
                    if(temp.getPoints().get(i).getX() == temp.getPoints().get(i+1).getX()){
                          if(temp.getPoints().get(i).getY() == temp.getPoints().get(i+1).getY()){  
                              bp.getPoints().remove(i-del);
                              del++;
                          }
                    }
                
            }
            }
        }
    }
    
       
}
