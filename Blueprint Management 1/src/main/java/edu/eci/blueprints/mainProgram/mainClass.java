/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.blueprints.mainProgram;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sarah.vieda
 */
public class mainClass {

    public static void main(String args[]) throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bps = ac.getBean(BlueprintsServices.class);

        Point[] pts = new Point[]{new Point(0, 0), new Point(10, 10)};
        Blueprint bp = new Blueprint("juan", "thearsw", pts);
        Point[] pts2 = new Point[]{new Point(10, 10), new Point(10, 10)};
        Blueprint bp2 = new Blueprint("juan", "thearep", pts);
        Point[] pts3 = new Point[]{new Point(15, 15), new Point(12, 1)};
        Blueprint bp3 = new Blueprint("juan", "thespti", pts);
        Point[] pts4 = new Point[]{new Point(12, 12), new Point(20, 20)};
        Blueprint bp4 = new Blueprint("armando", "themkt4", pts);
        Point[] pts5 = new Point[]{new Point(12, 12), new Point(20, 20)};
        Blueprint bp5 = new Blueprint("saris", "thearsw", pts);

        bps.addNewBlueprint(bp);
        bps.addNewBlueprint(bp2);
        bps.addNewBlueprint(bp3);
        bps.addNewBlueprint(bp4);
        bps.addNewBlueprint(bp5);
        System.out.println(bps.getBlueprint("armando", "themkt4"));
        System.out.println(bps.getBlueprintsByAuthor("juan"));
        System.out.println(bps.getAllBlueprints());
        System.out.println(bps.getBlueprintsByAuthor("saris"));
        //Deberia imprimir null ya que la autora saris no tiene una pintura llamada themkt4
        System.out.println(bps.getBlueprint("saris", "themkt4"));

    }

}
