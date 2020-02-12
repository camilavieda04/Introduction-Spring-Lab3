/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.services;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintsFilter;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author jimmy.chirivi
 */
@Service
public class BlueprintsRedundancy implements BlueprintsFilter {

    @Override
    public Blueprint filtering(Blueprint blueprint) {
        Set<Point> listap = new HashSet<>(blueprint.getPoints());
        Point[] points = new Point[listap.size()];
        int cont = 0;
        for (Point p:listap) {
            points[cont++]=p;
                }
           
        Blueprint bp = new Blueprint(blueprint.getAuthor(), blueprint.getName(), points);
        return bp;
    }
}
