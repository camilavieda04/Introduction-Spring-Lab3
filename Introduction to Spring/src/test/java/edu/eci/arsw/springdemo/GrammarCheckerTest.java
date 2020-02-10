/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Juan David
 */
public class GrammarCheckerTest {

    //@Test
    public void englishGrammarTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = ac.getBean(GrammarChecker.class);
        String ans = "Spell checking output:Checked with english checker:greatPlagiarism checking output: Not available yet";
        assertEquals(gc.check("great"),ans);
    }
    @Test
    public void espanishGrammarTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = ac.getBean(GrammarChecker.class);
        String ans = "Spell checking output:revisando (great) con el verificador de sintaxis del espanolPlagiarism checking output: Not available yet";
        assertEquals(gc.check("great"),ans);
    }
}