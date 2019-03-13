package com.ennsup.projetCalculatrice.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ensup.projetCalculatrice.service.CalculatriceService;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author lorris
 */
public class CalculatriceServiceTest {
    private CalculatriceService calc = new CalculatriceService();
    public CalculatriceServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void  additionTest()
    {
        assertTrue(calc.addition(4,6) == 10);
        assertTrue(calc.addition(4,6) == 11);
    }
    
    @Test
    public void  soustractionTest()
    {
        assertTrue(calc.soustraction(6,6) == 0);
    }
    @Test
    public void  multiplicationTest()
    {
        assertTrue(calc.multiplication(4,4) == 16);
    }
    @Test
    public void divisionTest()
    {
        assertTrue(calc.division(6,2) == 3);
    }
    
}
